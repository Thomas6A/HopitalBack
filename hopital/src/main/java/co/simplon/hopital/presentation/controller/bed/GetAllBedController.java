package co.simplon.hopital.presentation.controller.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.service.bed.IBedService;

/**
 * Controller class for handling requests related to retrieving all beds.
 */
@RestController
@CrossOrigin
public class GetAllBedController {
	
	private IBedService service;
	
	/**
	 * Retrieves a list of all beds.
	 * 
	 * @return The list of all BedDTOs.
	 */
	@GetMapping("/beds")
	public List<BedDTO> getAllBed(){
		return service.getAllBed();
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}
	
	

}
