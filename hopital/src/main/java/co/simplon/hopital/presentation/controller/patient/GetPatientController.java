package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class GetPatientController {
	
	private IPatientService service;
	
	@GetMapping("/patients/{id}")
	public PatientDTO getPatient(@PathVariable int id) {
		return service.getPatient(id);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
