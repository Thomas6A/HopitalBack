package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

/**
 * Controller class for handling requests related to creating patients.
 */
@RestController
@CrossOrigin
public class CreatePatientController {
	
	private IPatientService service;

	/**
	 * Creates a new patient.
	 * 
	 * @param patient The PatientDTO representing the patient to create.
	 */
	@PostMapping("/patients")
	public void createPatient(@RequestBody PatientDTO patient) {
		service.createPatient(patient);
	}
	
	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
