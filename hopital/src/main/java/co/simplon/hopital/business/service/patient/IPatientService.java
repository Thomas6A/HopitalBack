package co.simplon.hopital.business.service.patient;

import java.util.List;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.PatientDTO;

/**
 * Interface for managing operations related to Patient entities.
 */
public interface IPatientService {
	
	/**
	 * Creates a new patient.
	 * 
	 * @param patient The PatientDTO to create.
	 */
	public void createPatient(final PatientDTO patient);
	
	/**
	 * Updates the information of a patient.
	 * 
	 * @param patient The PatientDTO containing updated information.
	 */
	public void updatePatient(final PatientDTO patient);
	
	/**
	 * Deletes a patient.
	 * 
	 * @param patient The PatientDTO to delete.
	 */
	public void deletePatient(final PatientDTO patient);
	
	/**
	 * Retrieves a patient by ID.
	 * 
	 * @param id The ID of the patient to retrieve.
	 * @return The retrieved PatientDTO.
	 */
	public PatientDTO getPatient(final int id);
	
	/**
	 * Retrieves a list of all patients.
	 * 
	 * @return The list of all PatientDTOs.
	 */
	public List<PatientDTO> getAllPatient();
	
	/**
	 * Assigns a patient to a bed.
	 * 
	 * @param patient The PatientDTO to assign.
	 * @param bed The BedDTO to assign the patient to.
	 */
	public void affectPatient(final PatientDTO patient, final BedDTO bed);
	
	/**
	 * Removes a patient from a bed.
	 * 
	 * @param patient The PatientDTO to remove from the bed.
	 */
	public void removePatient(final PatientDTO patient);
	
	/**
	 * Retrieves a list of patients from a specific service.
	 * 
	 * @param name The name of the service to retrieve patients from.
	 * @return The list of PatientDTOs from the specified service.
	 */
	public List<PatientDTO> getPatientFromService(final String name);

}
