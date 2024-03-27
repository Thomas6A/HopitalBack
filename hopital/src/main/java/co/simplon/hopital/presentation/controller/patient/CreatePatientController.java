package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.DTO.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class CreatePatientController {
	
	private IPatientService service;

	@PostMapping("/patients")
	public void createPatient(@RequestBody PatientDTO patient) {
		service.createPatient(patient);
	}
	
	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
