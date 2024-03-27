package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.DTO.BedDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class AffectPatientController {
	
	private IPatientService service;
	
	@PutMapping("/affectPatients/{id}")
	public void affectPatient(@PathVariable int id, @RequestBody BedDTO bed) {
		service.affectPatient(service.getPatient(id), bed);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
