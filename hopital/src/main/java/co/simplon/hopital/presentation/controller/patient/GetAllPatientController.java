package co.simplon.hopital.presentation.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

/**
 * Controller class for handling requests related to retrieving all patients.
 */
@RestController
@CrossOrigin
public class GetAllPatientController {
	
	private IPatientService service;
	
	/**
	 * Retrieves a list of all patients.
	 * 
	 * @return The list of all PatientDTOs.
	 */
	@GetMapping("/patients")
	public List<PatientDTO> getAllPatients(){
		return service.getAllPatient();
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
