package co.simplon.hopital.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.service.patient.IPatientService;

/**
 * Controller class for handling requests related to affecting patients.
 */
@RestController
@CrossOrigin
public class AffectPatientController {
	
	private IPatientService service;
	
	/**
	 * Affects a patient to a bed.
	 * 
	 * @param id The ID of the patient to affect.
	 * @param bed The BedDTO representing the bed to assign to the patient.
	 */
	@PutMapping("/affectPatients/{id}")
	public void affectPatient(@PathVariable int id, @RequestBody BedDTO bed) {
		service.affectPatient(service.getPatient(id), bed);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	

}
