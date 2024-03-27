package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class RemovePatientController {
	
	private IPatientService service;
	
	@PutMapping("/removePatients")
	public void removePatient(@RequestBody PatientDTO patient) {
		service.removePatient(patient);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
