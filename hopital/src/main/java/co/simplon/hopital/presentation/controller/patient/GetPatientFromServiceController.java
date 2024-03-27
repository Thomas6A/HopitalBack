package co.simplon.hopital.presentation.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.DTO.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class GetPatientFromServiceController {
	
	private IPatientService service;
	
	@GetMapping("/patientsFromService/{name}")
	public List<PatientDTO> getPatientFromService(final @PathVariable String name){
		return service.getPatientFromService(name);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
