package co.simplon.hopital.presentation.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.business.service.service.IServiceService;

@RestController
@CrossOrigin
public class GetAllServiceController {
	
	private IServiceService service;
	
	@GetMapping("/services")
	public List<ServiceDTO> getAllService(){
		return service.getAllService();
	}

	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}
	
	

}
