package com.yobitrust.HachCovid19Back.Controllers;
import com.sun.jdi.VoidType;
import com.yobitrust.HachCovid19Back.Models.Patient;
import com.yobitrust.HachCovid19Back.Models.PatientParts.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.BILAN.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.Autre;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.ECG;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.TdmTho;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli.Thorax;
import com.yobitrust.HachCovid19Back.Models.PatientParts.Exam_Bio.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAK1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAKUR1;
import com.yobitrust.HachCovid19Back.Models.PatientParts.IONOGRA.NAk;
import com.yobitrust.HachCovid19Back.Models.PatientParts.NFS.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.admission.AdmHHop;
import com.yobitrust.HachCovid19Back.Models.PatientParts.admission.AdmHop;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Pcr;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAc;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.RapideAg;
import com.yobitrust.HachCovid19Back.Models.PatientParts.confDiags.Serologie;
import com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.gdsa.*;
import com.yobitrust.HachCovid19Back.Models.PatientParts.traitement.*;
import com.yobitrust.HachCovid19Back.Models.RequestModels.*;
import com.yobitrust.HachCovid19Back.Repositories.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;



    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/addPatient")
    public ResponseEntity addPatient(@RequestBody AddPatient model) {
        Patient patient = patientRepository.findByCinAndMatricule(model.getCin(), model.getMatricule());
        if (patient != null)
            return ResponseEntity.ok("Cin or/and matricule already existed");
        Patient newPatient = new Patient();
        newPatient.setCin(model.getCin());
        newPatient.setMatricule(model.getMatricule());
        ModelMapper mapper= new ModelMapper();
        GeneralInformation generalInformation = mapper.map(model,GeneralInformation.class);
        newPatient.setGeneralInformation(generalInformation);
        patientRepository.save(newPatient);
        return ResponseEntity.ok("Patient added successfuly");
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @GetMapping("/getAllPatients")
    public ResponseEntity getAllPatients(){
        List<Patient> patients= patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @GetMapping("/search/{cin}")
    public ResponseEntity searchPatient(@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-habitudes-de-vie/{cin}")
    public ResponseEntity addHabitudesDeVie(@RequestBody HabitudesDeVie habitudesDeVie,@PathVariable Integer cin){
        Patient patient=patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setHabitudesDeVie(habitudesDeVie);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-infos-generales/{cin}")
    public ResponseEntity addInfosGenerales(@RequestBody GeneralInformation generalInformation ,@PathVariable Integer cin){
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        else patient.setGeneralInformation(generalInformation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-antecedents-medicaux/{cin}")
    public ResponseEntity addAntecedentsMedicaux(@RequestBody AntecedentMedical antecedentMedical,@PathVariable Integer cin) {
        Patient patient =patientRepository.findByCin(cin);
        if(patient==null)
            return ResponseEntity.ok("Patient not found");
        ModelMapper mapper= new ModelMapper();
        HashMap<String, AntecedentMedicaux> antecedents =patient.getAntecedentMedicaux();
        if(antecedentMedical.getAntecedent().equals("grossesse")){

            Grossesse grossesse = mapper.map(antecedentMedical, Grossesse.class);
            antecedents.put("grossesse",grossesse);
            patient.setAntecedentMedicaux(antecedents);

        }
        else if (antecedentMedical.getAntecedent().equals("PathResChronique")){
            PathRespChronique pathRespChronique=mapper.map(antecedentMedical,PathRespChronique.class);
            System.out.println(pathRespChronique.toString());
            antecedents.put("PathResChronique",pathRespChronique);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Cardiopathies")){
            Cardiopathies cardiopathies=mapper.map(antecedentMedical,Cardiopathies.class);
            antecedents.put("Cardiopathies",cardiopathies);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("TrRythCardiaque")){
            TrRythCardiaque trRythCardiaque =mapper.map(antecedentMedical,TrRythCardiaque.class);
            antecedents.put("TrRythCardiaque",trRythCardiaque);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("HTA")){
            HTA hta =mapper.map(antecedentMedical,HTA.class);
            antecedents.put("HTA",hta);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Diabete")){
            Diabete diabete=mapper.map(antecedentMedical,Diabete.class);
            antecedents.put("Diabete",diabete);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("InsRenaleChro")){
            InsRenaleChro insRenaleChro=mapper.map(antecedentMedical,InsRenaleChro.class);
            antecedents.put("InsRenaleChro",insRenaleChro);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("AVC")){
            AVC avc = mapper.map(antecedentMedical,AVC.class);
            antecedents.put("AVC",avc);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Retinopathie")){
            Retinopathie retinopathie=mapper.map(antecedentMedical,Retinopathie.class);
            antecedents.put("Retinopathie",retinopathie);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("ATCDchir")){
            ATCDchir atcDchir =mapper.map(antecedentMedical,ATCDchir.class);
            antecedents.put("ATCDchir",atcDchir);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("PriseAINS")){
            PriseAINS priseAINS=mapper.map(antecedentMedical,PriseAINS.class);
            antecedents.put("PriseAINS",priseAINS);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("Immunosuppreseur")){
            Immunosuppreseur immunosuppreseur=mapper.map(antecedentMedical,Immunosuppreseur.class);
            antecedents.put("Immunosuppreseur",immunosuppreseur);
            patient.setAntecedentMedicaux(antecedents);
        }
        else if(antecedentMedical.getAntecedent().equals("AutresATCD")){
            if(antecedents.containsKey("AutresATCD")){
                List<String> autres= (List<String>) antecedents.get("AutresATCD");
                autres.add(antecedentMedical.getAutres());
                AutresATCD autresATCD = (AutresATCD) antecedents.get("AutresATCD");
                autresATCD.setAutres(autres);
                antecedents.put("AutresATCD", autresATCD);
                patient.setAntecedentMedicaux(antecedents);

            }
            else {
                AutresATCD autresATCD=new AutresATCD();
                List<String> autres = autresATCD.getAutres();
                autres.add(antecedentMedical.getAutres());
                autresATCD.setAutres(autres);
                antecedents.put("AutresATCD", autresATCD);
                patient.setAntecedentMedicaux(antecedents);
            }

        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @GetMapping("/get-all-antecedents-medicaux/{cin}")
    public  ResponseEntity getAllAntecedentsMedicaux(@PathVariable Integer cin){

        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<String> antecedents = new ArrayList<String>(patient.getAntecedentMedicaux().keySet());
        return  ResponseEntity.ok(antecedents);

    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-antecedent-medical/{cin}")
    public ResponseEntity deleteAntecedentMedical(@PathVariable Integer cin , @RequestBody RemoveAntecedent antecedent){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        HashMap<String, AntecedentMedicaux> antecedents =patient.getAntecedentMedicaux();
        antecedents.remove(antecedent.getAntecedent());
        patient.setAntecedentMedicaux(antecedents);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getAntecedentMedicaux().keySet());

    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-info-generales/{cin}")
    public ResponseEntity deletePatientS(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        GeneralInformation generalInformations =null;
        patient.setGeneralInformation(generalInformations);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-antecedent-medical/{cin}")
    public ResponseEntity deletePatient(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        HashMap<String, AntecedentMedicaux> antecedents =null;
        patient.setAntecedentMedicaux(antecedents);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-habitudes-de-vie/{cin}")
    public ResponseEntity deletePatientsss(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<ConfDiag> confDiag =null;
        patient.setConfDiags(confDiag);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-Conf-Diags/{cin}")
    public ResponseEntity deletePatientConfDiags(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<ConfDiag> confDiags =null;
        patient.setConfDiags(confDiags);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-Admissions/{cin}")
    public ResponseEntity deletePatientAdmissions(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        List<Admission> admissions =null;
        patient.setAdmissions(admissions);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-ExpoRisque/{cin}")
    public ResponseEntity deletePatientExpoRisque(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExpoRisque expoRisque =null;
        patient.setExpoRisque(expoRisque);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-ExamBio/{cin}")
    public ResponseEntity deletePatientExamBios(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExamBio examBio =null;
        patient.setExamBio(examBio);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-CaracCliniques/{cin}")
    public ResponseEntity deletePatientCaracCliniques(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        CaracCliniques caracCliniques =null;
        patient.setCaracCliniques(caracCliniques);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }

    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-ExamenCli/{cin}")
    public ResponseEntity deletePatientExamenCli(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExamenCli examenCli =null;
        patient.setExamenCli(examenCli);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-ExamRadio_ParaCli/{cin}")
    public ResponseEntity deletePatientExamRadio_ParaCli(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        ExamRadio_ParaCli examRadio_ParaCli =null;
        patient.setExamRadio_paraCli(examRadio_ParaCli);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-EvaluationFinale/{cin}")
    public ResponseEntity deletePatientEvaluationFinale(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        EvaluationFinale evaluationFinale =null;
        patient.setEvaluationFinale(evaluationFinale);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-Traitement/{cin}")
    public ResponseEntity deletePatientTraitement(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        Traitement traitement =null;
        patient.setTraitement(traitement);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/remove-p-EvoluationQuo/{cin}")
    public ResponseEntity deletePatientEvoluationQuo(@PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        if(patient==null) return ResponseEntity.ok("No patient having \""+cin+"\"as cin ");
        EvoluationQuo evoluationQuo =null;
        patient.setEvolution(evoluationQuo);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }

















    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-exposition/{cin}")
    public ResponseEntity addExposition(@PathVariable Integer cin , @RequestBody Exposition exposition){
        Patient patient = patientRepository.findByCin(cin);
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        ModelMapper mapper= new ModelMapper();
        Arrivee arrivee = mapper.map(exposition,Arrivee.class);
        Parcours parcours =mapper.map(exposition,Parcours.class);
        ZoneRisque zoneRisque=mapper.map(exposition,ZoneRisque.class);
        ContactEtroit contactEtroit=mapper.map(exposition,ContactEtroit.class);
        AutreCritere autreCritere=mapper.map(exposition,AutreCritere.class);
        Quarantine quarantine=mapper.map(exposition,Quarantine.class);
        ExpoRisque  expoRisque=new ExpoRisque(zoneRisque,arrivee,parcours,contactEtroit,autreCritere,quarantine);
        patient.setExpoRisque(expoRisque);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }

    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("add-confDiag/{cin}")
    public ResponseEntity addConfDiag(@PathVariable Integer cin, @RequestBody ConfDiagModel confDiagModel){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        if(confDiagModel.getTest().equals("Pcr")){
            Pcr pcr=mapper.map(confDiagModel,Pcr.class);
            patient.getConfDiags().add(pcr);
        }
        if(confDiagModel.getTest().equals("RapideAc")){
            RapideAc rapideAc=mapper.map(confDiagModel,RapideAc.class);
            patient.getConfDiags().add(rapideAc);
        }
        if(confDiagModel.getTest().equals("RapideAg")){
            RapideAg rapideAg=mapper.map(confDiagModel,RapideAg.class);
            patient.getConfDiags().add(rapideAg);
        }
        if(confDiagModel.getTest().equals("Serologie")){
            Serologie serologie =mapper.map(confDiagModel,Serologie.class);
            patient.getConfDiags().add(serologie);
        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-admission/{cin}")
    public ResponseEntity addAdmission(@PathVariable Integer cin , @RequestBody AdmissionModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        if (model.getType().equals("hop")){
            AdmHop admHop= mapper.map(model,AdmHop.class);
            patient.getAdmissions().add(admHop);
        }
        if(model.getType().equals("hhop")){
            AdmHHop admHHop=mapper.map(model,AdmHHop.class);
            patient.getAdmissions().add(admHHop);
        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-carac-cliniques/{cin}")
    public ResponseEntity addCaracCliniques(@PathVariable Integer cin , @RequestBody CaracCliniquesModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        //System.out.println(patient.getDiagnostics().get(index).getCaracCliniques());

        if(patient.getCaracCliniques()==null){
            patient.setCaracCliniques(new CaracCliniques());
        }
        patient.getCaracCliniques().setSym(model.getSym());
        if(model.getSym()==false){
            patientRepository.save(patient);
            return  ResponseEntity.ok(patient);
        }
        if(model.getType().equals("Fievre")){
            Fievre fievre =mapper.map(model,Fievre.class);
            patient.getCaracCliniques().getSymptomes().put("Fievre",fievre);
        }
        if(model.getType().equals("Toux")){
            Toux toux=mapper.map(model,Toux.class);
            patient.getCaracCliniques().getSymptomes().put("Toux",toux);
        }
        if(model.getType().equals("Cephalees")){
            Cephalees cephalees=mapper.map(model,Cephalees.class);
            patient.getCaracCliniques().getSymptomes().put("Cephalees",cephalees);
        }
        if(model.getType().equals("AshthFat")){
            AshthFat ashthFat=mapper.map(model,AshthFat.class);
            patient.getCaracCliniques().getSymptomes().put("AshthFat",ashthFat);
        }
        if(model.getType().equals("MyalCourba")){
            MyalCourba myalCourba =mapper.map(model,MyalCourba.class);
            patient.getCaracCliniques().getSymptomes().put("MyalCourba",myalCourba);
        }
        if(model.getType().equals("Odynophagie")){
            Odynophagie odynophagie=mapper.map(model,Odynophagie.class);
            patient.getCaracCliniques().getSymptomes().put("Odynophagie",odynophagie);
        }
        if(model.getType().equals("RhinoCongNas")){
            RhinoCongNas rhinoCongNas =mapper.map(model,RhinoCongNas.class);
            patient.getCaracCliniques().getSymptomes().put("RhinoCongNas",rhinoCongNas);
        }
        if(model.getType().equals("Anosmie")){
            Anosmie anosmie=mapper.map(model,Anosmie.class);
            patient.getCaracCliniques().getSymptomes().put("Anosmie",anosmie);
        }
        if(model.getType().equals("Agueusie")){
            Agueusie agueusie=mapper.map(model,Agueusie.class);
            patient.getCaracCliniques().getSymptomes().put("Agueusie",agueusie);
        }
        if(model.getType().equals("Diarrhee")){
            Diarrhee diarrhee= mapper.map(model,Diarrhee.class);
            patient.getCaracCliniques().getSymptomes().put("Diarrhee",diarrhee);
        }
        if(model.getType().equals("NauVoumi")){
            NauVoumi nauVoumi=mapper.map(model,NauVoumi.class);
            patient.getCaracCliniques().getSymptomes().put("NauVoumi",nauVoumi);
        }
        if(model.getType().equals("ErruptionCu")){
            ErruptionCu erruptionCu=mapper.map(model,ErruptionCu.class);
            patient.getCaracCliniques().getSymptomes().put("ErruptionCu",erruptionCu);
        }
        if(model.getType().equals("Engelure")){
            Engelure engelure=mapper.map(model,Engelure.class);
            patient.getCaracCliniques().getSymptomes().put("Engelure",engelure);
        }
        if(model.getType().equals("DouleurThora")){
            DouleurThora douleurThora=mapper.map(model,DouleurThora.class);
            patient.getCaracCliniques().getSymptomes().put("DouleurThora",douleurThora);
        }
        if(model.getType().equals("GeneRespi")){
            GeneRespi geneRespi =mapper.map(model,GeneRespi.class);
            patient.getCaracCliniques().getSymptomes().put("GeneRespi",geneRespi);
        }
        if(model.getType().equals("Essouflement")){
            Essouflement essouflement =mapper.map(model,Essouflement.class);
            patient.getCaracCliniques().getSymptomes().put("Essouflement",essouflement);
        }
        if(model.getType().equals("Autre")){
            Autre autre=mapper.map(model,Autre.class);
            patient.getCaracCliniques().getSymptomes().put("Autre",autre);
        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-traitement/{cin}")
    public ResponseEntity addTraitement(@RequestBody TraitementModel model, @PathVariable Integer cin ){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }


        if(patient.getCaracCliniques()==null){
            patient.setCaracCliniques(new CaracCliniques());
        }
        patient.getTraitement().setTrait(model.getTrait());
        if(model.getTrait()==false){
            patientRepository.save(patient);
            return  ResponseEntity.ok(patient);
        }
        if(model.getType().equals("ADO")){
            ADO ado =mapper.map(model, ADO.class);
            patient.getTraitement().getTraitementPart().put("ADO",ado);
        }
        if(model.getType().equals("Amoxicilline")){
            Amoxicilline amoxicilline =mapper.map(model, Amoxicilline.class);
            patient.getTraitement().getTraitementPart().put("Amoxicilline",amoxicilline);
        }
        if(model.getType().equals("ADO")){
            Amoxicilline amoxicilline =mapper.map(model, Amoxicilline.class);
            patient.getTraitement().getTraitementPart().put("Amoxicilline",amoxicilline);
        }
        if(model.getType().equals("Anti_coagulant")){
            Anti_coagulant anti_coagulant =mapper.map(model, Anti_coagulant.class);
            patient.getTraitement().getTraitementPart().put("Anti_coagulant",anti_coagulant);
        }

        if(model.getType().equals("AutreTrait")){
            AutreTrait autre =mapper.map(model, AutreTrait.class);
            patient.getTraitement().getTraitementPart().put("AutreTrait",autre);
        }
        if(model.getType().equals("Azithromycine")){
            Azithromycine azithromycine =mapper.map(model, Azithromycine.class);
            patient.getTraitement().getTraitementPart().put("Azithromycine",azithromycine);
        }
        if(model.getType().equals("Cefotaxime")){
            Cefotaxime cefotaxime =mapper.map(model, Cefotaxime.class);
            patient.getTraitement().getTraitementPart().put("Cefotaxime",cefotaxime);
        }
        if(model.getType().equals("Ceftriaxone")){
            Ceftriaxone ceftriaxone =mapper.map(model, Ceftriaxone.class);
            patient.getTraitement().getTraitementPart().put("Ceftriaxone",ceftriaxone);
        }
        if(model.getType().equals("Chloroquine_phosphate")){
            Chloroquine_phosphate chloroquine_phosphate =mapper.map(model, Chloroquine_phosphate.class);
            patient.getTraitement().getTraitementPart().put("Chloroquine_phosphate",chloroquine_phosphate);
        }
        if(model.getType().equals("CPAP")){
            CPAP cpap =mapper.map(model, CPAP.class);
            patient.getTraitement().getTraitementPart().put("CPAP",cpap);
        }
        if(model.getType().equals("H2O")){
            H2O h2o =mapper.map(model, H2O.class);
            patient.getTraitement().getTraitementPart().put("H2O",h2o);
        }
        if(model.getType().equals("HFNC")){
            HFNC hfnc =mapper.map(model, HFNC.class);
            patient.getTraitement().getTraitementPart().put("HFNC",hfnc);
        }
        if(model.getType().equals("Hydroxy_Chloroquine")){
            Hydroxy_Chloroquine hydroxy_Chloroquine =mapper.map(model, Hydroxy_Chloroquine.class);
            patient.getTraitement().getTraitementPart().put("Hydroxy_Chloroquine",hydroxy_Chloroquine);
        }
        if(model.getType().equals("Insulinotherapie")){
            Insulinotherapie insulinotherapie =mapper.map(model, Insulinotherapie.class);
            patient.getTraitement().getTraitementPart().put("Insulinotherapie",insulinotherapie);
        }
        if(model.getType().equals("Lopinavir_ritonavir")){
            Lopinavir_ritonavir lopinavir_ritonavir =mapper.map(model, Lopinavir_ritonavir.class);
            patient.getTraitement().getTraitementPart().put("Lopinavir_ritonavir",lopinavir_ritonavir);
        }
        if(model.getType().equals("Nebulisation_bronchodilatateurs")){
            Nebulisation_bronchodilatateurs nebulisation_bronchodilatateurs =mapper.map(model, Nebulisation_bronchodilatateurs.class);
            patient.getTraitement().getTraitementPart().put("Nebulisation_bronchodilatateurs",nebulisation_bronchodilatateurs);
        }
        if(model.getType().equals("Nebulisation_corticoides")){
            Nebulisation_corticoides nebulisation_corticoides =mapper.map(model, Nebulisation_corticoides.class);
            patient.getTraitement().getTraitementPart().put("Nebulisation_corticoides",nebulisation_corticoides);
        }
        if(model.getType().equals("O2")){
            O2 o =mapper.map(model, O2.class);
            patient.getTraitement().getTraitementPart().put("O2",o);
        }
        if(model.getType().equals("Paracetamol")){
            Paracetamol paracetamol =mapper.map(model, Paracetamol.class);
            patient.getTraitement().getTraitementPart().put("Paracetamol",paracetamol);
        }
        if(model.getType().equals("Remdesivir")){
            Remdesivir remdesivir =mapper.map(model, Remdesivir.class);
            patient.getTraitement().getTraitementPart().put("Remdesivir",remdesivir);
        }
        if(model.getType().equals("VMI")){
            VMI vmi =mapper.map(model, VMI.class);
            patient.getTraitement().getTraitementPart().put("VMI",vmi);
        }
        if(model.getType().equals("VNI")){
            VNI vni =mapper.map(model, VNI.class);
            patient.getTraitement().getTraitementPart().put("VNI",vni);
        }

        patientRepository.save(patient);
        return ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-examen-cli/{cin}")
    public ResponseEntity addExamenCli(@PathVariable Integer cin , @RequestBody ExamenCliModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        ExamenCli examenCli=mapper.map(model,ExamenCli.class);
        patient.setExamenCli(examenCli);
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);

    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-examen-radio-paracli/{cin}")
    public ResponseEntity addExamenRadioParaCli(@PathVariable Integer cin ,@RequestBody ExamRadioParaCliModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        if(model.getType().equals("Thorax")){
            Thorax thorax=mapper.map(model,Thorax.class);
            //patient.getDiagnostics().get(index).setExamRadio_paraCli(new ExamRadio_ParaCli());
            patient.getExamRadio_paraCli().getThoraxes().add(thorax);
        }
        if(model.getType().equals("TdmTho")){
            TdmTho tdmTho=mapper.map(model,TdmTho.class);
            patient.getExamRadio_paraCli().getTdmThos().add(tdmTho);
        }
        if(model.getType().equals("ECG")){
            ECG ecg=mapper.map(model,ECG.class);
            patient.getExamRadio_paraCli().getEcgs().add(ecg);
        }
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("add-evaluation-finale/{cin}")
    public ResponseEntity addEvaluationFinale(@PathVariable Integer cin, @RequestBody EvaluationModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        EvaluationFinale evaluation =mapper.map(model,EvaluationFinale.class);
        patient.setEvaluationFinale(evaluation);
        patientRepository.save(patient);
        return ResponseEntity.ok(patient);
    }
    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping("/add-examen-bio/{cin}")
    public ResponseEntity addExamBio(@PathVariable Integer cin , @RequestBody ExamBioModel model  ){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }
        if(model.getType().equals("NFS")){
            LYM lym =mapper.map(model, LYM.class);
            patient.getExamBio().getNfs().getLyms().add(lym);
            GB gb =mapper.map(model, GB.class);
            patient.getExamBio().getNfs().getGbs().add(gb);
            HB hb =mapper.map(model, HB.class);
            patient.getExamBio().getNfs().getHbs().add(hb);
            HT ht =mapper.map(model, HT.class);
            patient.getExamBio().getNfs().getHts().add(ht);
            PLA pla =mapper.map(model, PLA.class);
            patient.getExamBio().getNfs().getPlas().add(pla);
        }
        if(model.getType().equals("Ionogra")){
            NAk nak =mapper.map(model, NAk.class);
            patient.getExamBio().getIonogras().getNaks().add(nak);
            NAK1 nak1 =mapper.map(model, NAK1.class);
            patient.getExamBio().getIonogras().getNak1s().add(nak1);
            NAKUR nakur =mapper.map(model, NAKUR.class);
            patient.getExamBio().getIonogras().getNakUrs().add(nakur);
            NAKUR1 nakur1 =mapper.map(model, NAKUR1.class);
            patient.getExamBio().getIonogras().getNakUr1s().add(nakur1);
        }
        if(model.getType().equals("GDSA")){
            PH ph =mapper.map(model, PH.class);
            patient.getExamBio().getGdsas().getPhs().add(ph);
            PAO2 pao2 =mapper.map(model, PAO2.class);
            patient.getExamBio().getGdsas().getPao2s().add(pao2);
            PACO2 paco2 =mapper.map(model, PACO2.class);
            patient.getExamBio().getGdsas().getPaco2s().add(paco2);
            HCO3 hco3 =mapper.map(model, HCO3.class);
            patient.getExamBio().getGdsas().getHco3s().add(hco3);
            SAO2 sao2 =mapper.map(model, SAO2.class);
            patient.getExamBio().getGdsas().getSao2s().add(sao2);
        }
        if(model.getType().equals("BilanRenal")){
            CREAT creat =mapper.map(model, CREAT.class);
            patient.getExamBio().getBilanRenal().getCreats().add(creat);
            CLAIRCREAT claircreat =mapper.map(model, CLAIRCREAT.class);
            patient.getExamBio().getBilanRenal().getClairCreats().add(claircreat);
            UREE uree =mapper.map(model, UREE.class);
            patient.getExamBio().getBilanRenal().getUrees().add(uree);
        }
        if(model.getType().equals("BilanHepa")){
            BILIRU biliru =mapper.map(model, BILIRU.class);
            patient.getExamBio().getBilanHepa().getBilirus().add(biliru);
            BILIRU1 biliru1 =mapper.map(model, BILIRU1.class);
            patient.getExamBio().getBilanHepa().getBiliru1s().add(biliru1);
            ALAT alat =mapper.map(model, ALAT.class);
            patient.getExamBio().getBilanHepa().getAlats().add(alat);
            ASAT asat =mapper.map(model, ASAT.class);
            patient.getExamBio().getBilanHepa().getAsats().add(asat);
            TP tp =mapper.map(model, TP.class);
            patient.getExamBio().getBilanHepa().getTps().add(tp);
            FACTEURV facteurv =mapper.map(model, FACTEURV.class);
            patient.getExamBio().getBilanHepa().getFacteurVs().add(facteurv);
            FIBRINOGENE fibrinogene =mapper.map(model, FIBRINOGENE.class);
            patient.getExamBio().getBilanHepa().getFibrinogenes().add(fibrinogene);
            CPK_MB cpk_mb =mapper.map(model, CPK_MB.class);
            patient.getExamBio().getBilanHepa().getCpk_mbs().add(cpk_mb);
            TROPONINE troponine =mapper.map(model, TROPONINE.class);
            patient.getExamBio().getBilanHepa().getTroponines().add(troponine);
            PRO_BNP pro_bnp =mapper.map(model, PRO_BNP.class);
            patient.getExamBio().getBilanHepa().getPro_bnps().add(pro_bnp);
            ALBUMI albumi =mapper.map(model, ALBUMI.class);
            patient.getExamBio().getBilanHepa().getAlbumis().add(albumi);
            D_DIMERE d_dimere =mapper.map(model, D_DIMERE.class);
            patient.getExamBio().getBilanHepa().getD_dimères().add(d_dimere);
            LDH ldh =mapper.map(model, LDH.class);
            patient.getExamBio().getBilanHepa().getLdhs().add(ldh);
            CRP crp =mapper.map(model, CRP.class);
            patient.getExamBio().getBilanHepa().getCrps().add(crp);
            PROCAL procal =mapper.map(model, PROCAL.class);
            patient.getExamBio().getBilanHepa().getProcals().add(procal);
            FERRI ferri =mapper.map(model, FERRI.class);
            patient.getExamBio().getBilanHepa().getFerris().add(ferri);
        }
        if(model.getType().equals("AutreBilan")){
            PATHS paths =mapper.map(model, PATHS.class);
            patient.getExamBio().getAutreBilans().getPathss().add(paths);

        }
        patientRepository.save(patient);
        return  ResponseEntity.ok(patient);
    }


    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
    @PostMapping ("/add-Evolution/{cin}")
    public ResponseEntity addEvolution(@PathVariable Integer cin, @RequestBody EvolutionModel model){
        Patient patient = patientRepository.findByCin(cin);
        ModelMapper mapper= new ModelMapper();
        if (patient == null){
            return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
        }

        if(model.getCategory().equals("evaluValues")){
            EvaluValue evaluValue= mapper.map(model,EvaluValue.class);
            if(patient.getEvolution().getEvaluations().get(model.getType())==null)
            {
                EvaluValueList list = new EvaluValueList();
                list.getEvaluValues().add(evaluValue);
                patient.getEvolution().getEvaluations().put(model.getType(),list);
            }
            else patient.getEvolution().getEvaluations().get(model.getType()).getEvaluValues().add(evaluValue);
        }
        if(model.getCategory().equals("USI")){
            USIValue  usiValue = mapper.map(model,USIValue.class);

            if(patient.getEvolution().getUsiValues().get(model.getType()) ==null){
                //System.out.println("cc value");
                UsiValueList list = new UsiValueList();
                list.getUsiValues().add(usiValue);
                //System.out.println(list.getUsiValues().size());
                patient.getEvolution().getUsiValues().put(model.getType(), list);
            }
            else patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().add(usiValue);
        }
        if(model.getCategory().equals("AssResp")){
            AssRespValue value= mapper.map(model,AssRespValue.class);

            if(patient.getEvolution().getAssRespValues().get(model.getType())==null){
                AssRespList list= new AssRespList();
                list.getAssRespValues().add(value);
                patient.getEvolution().getAssRespValues().put(model.getType(),list);

            }
            else patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().add(value);
        }
        if(model.getCategory().equals("Evolution")){
            Evolution evolution;
            if(model.getType().equals("IHH")){
                evolution= mapper.map(model,EvolutionIHH.class);
                patient.getEvolution().getEvolutions().add(evolution);

            }
            if(model.getType().equals("Ho")){
                evolution=mapper.map(model,EvolutionHo.class);
                patient.getEvolution().getEvolutions().add(evolution);
            }
        }

        patientRepository.save(patient);
        return ResponseEntity.ok(patient.getEvolution());
        }


    @CrossOrigin(origins ="https://sars-cov2-tun.web.app" )
         @PostMapping("/get-evolution/{cin}")

         public ResponseEntity getEvolution(@PathVariable Integer cin ,@RequestBody GetEvolutionModel model){
             Patient patient = patientRepository.findByCin(cin);
             //ModelMapper mapper= new ModelMapper();
             if (patient == null){
                 return  ResponseEntity.ok("No patient hacing"+cin+" as cin");
             }
             // if transfert usi
             if(model.getCategory().equals("AssResp") ){
                 if(patient.getEvolution()==null
                         || patient.getEvolution().getAssRespValues()==null
                         || patient.getEvolution().getAssRespValues().get(model.getType()) == null
                         || patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues()==null
                         || patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().size()==0

                 )

                     return ResponseEntity.ok("Aucun Transfert trouvé !");
                 else return ResponseEntity.ok(patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().get(patient.getEvolution().getAssRespValues().get(model.getType()).getAssRespValues().size()-1));
             }
             // if transfert assistance respura
             if(model.getCategory().equals("USI") ){
                 if(patient.getEvolution()==null
                         || patient.getEvolution().getUsiValues()==null
                         || patient.getEvolution().getUsiValues().get(model.getType()) == null
                         || patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues()==null
                         || patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().size()==0

                 )

                     return ResponseEntity.ok("Aucun Transfert trouvé !");
                 else return ResponseEntity.ok(patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().get(patient.getEvolution().getUsiValues().get(model.getType()).getUsiValues().size()-1));
             }
             return ResponseEntity.ok("Aucun !");

         }
    }





