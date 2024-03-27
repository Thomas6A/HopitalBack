package co.simplon.hopital.business.service.patient;

import java.util.List;

import co.simplon.hopital.business.DTO.BedDTO;
import co.simplon.hopital.business.DTO.PatientDTO;

public interface IPatientService {
	
	public void createPatient(final PatientDTO patient);
	
	public void updatePatient(final PatientDTO patient);
	
	public void deletePatient(final PatientDTO patient);
	
	public PatientDTO getPatient(final int id);
	
	public List<PatientDTO> getAllPatient();
	
	public void affectPatient(final PatientDTO patient, final BedDTO bed);
	
	public void removePatient(final PatientDTO patient);
	
	public List<PatientDTO> getPatientFromService(final String name);

}
