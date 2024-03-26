package co.simplon.hopital.presentation.controller.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.DTO.BedDTO;
import co.simplon.hopital.business.service.bed.IBedService;

@RestController
@CrossOrigin
public class GetAllBedController {
	
	private IBedService service;
	
	@GetMapping("/beds")
	public List<BedDTO> getAllBed(){
		return service.getAllBed();
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}
	
	

}
