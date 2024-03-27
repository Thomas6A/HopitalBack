package co.simplon.hopital.presentation.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.DTO.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class GetAllPatientController {
	
	private IPatientService service;
	
	@GetMapping("/patients")
	public List<PatientDTO> getAllPatients(){
		return service.getAllPatient();
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
