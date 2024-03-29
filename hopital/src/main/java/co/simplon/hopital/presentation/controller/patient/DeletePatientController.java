package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

/**
 * Controller class for handling requests related to deleting patients.
 */
@RestController
@CrossOrigin
public class DeletePatientController {
	
	private IPatientService service;
	
	/**
	 * Deletes a patient.
	 * 
	 * @param patient The PatientDTO representing the patient to delete.
	 */
	@DeleteMapping("/patients")
	public void deletePatient(@RequestBody PatientDTO patient) {
		service.deletePatient(patient);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
