package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dz.ibnrochd.master14.model.Patient;

@Mapper
public interface PatientMapper {
	//Patient findPatientWithConsultationsById(int id);
    List<Patient> TousPatients();
    List<Patient> FindByNom(String nom);
    void NouveauPatient(Patient patient);
 
}
