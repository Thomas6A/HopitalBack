package co.simplon.hopital.presentation.controller.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.service.bed.IBedService;

/**
 * Controller class for handling requests related to retrieving all free beds.
 */
@RestController
@CrossOrigin
public class GetAllFreeBedController {
	
private IBedService service;
	
	/**
	 * Retrieves a list of all free beds.
	 * 
	 * @return The list of all free BedDTOs.
	 */
	@GetMapping("/freebeds")
	public List<BedDTO> getAllFreeBed(){
		return service.getAllFreeBed();
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}
	

}
