package co.simplon.hopital.presentation.controller.patient;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.DTO.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class UpdatePatientController {
	
	private IPatientService service;
	
	@PutMapping("/patients")
	public void updatePatient(@RequestBody PatientDTO patient) {
		service.updatePatient(patient);
	}

	public void setService(IPatientService service) {
		this.service = service;
	}

}
