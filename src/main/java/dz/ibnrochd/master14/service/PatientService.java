package dz.ibnrochd.master14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mapper.PatientMapper;
import dz.ibnrochd.master14.model.Patient;

@Service
public class PatientService {
	private final PatientMapper patientMapper;

    @Autowired
    public PatientService(PatientMapper patientMapper) {
        this.patientMapper = patientMapper;
    }

    public void TousPatients() {
        List<Patient> patients = patientMapper.TousPatients();
        for (Patient patient : patients) {
            System.out.println("Patient N°" + patient.getId() + ": " + patient.getNom()); 
        }
    }
    
    public void FindByNom(String nom) {
        List<Patient> Nom = patientMapper.FindByNom(nom);

        if (Nom.isEmpty()) {
            System.out.println("Pas de patient avec le nom '" + nom +" !!! " );
        } else {
            System.out.println("Patients dont le nom : '" + nom + "' sont :");
            for (Patient patient : Nom) {
                System.out.println("	Prénom: " + patient.getPrenom());
                
            }
        }
    }
    
   
    public void NouveauPatient(Patient patient) {
        patientMapper.NouveauPatient(patient);
    }
    
}
