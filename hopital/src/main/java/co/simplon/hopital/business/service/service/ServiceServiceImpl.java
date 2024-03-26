package co.simplon.hopital.business.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.hopital.business.DTO.ServiceDTO;
import co.simplon.hopital.business.convert.ServiceConvert;
import co.simplon.hopital.persistance.repository.IServiceRepository;

@Service
public class ServiceServiceImpl implements IServiceService {
	
	private IServiceRepository repo;

	@Override
	public List<ServiceDTO> getAllService() {
		return ServiceConvert.getInstance().convertListEntityToListDTO(repo.findAll());
	}

	@Autowired
	public void setRepo(IServiceRepository repo) {
		this.repo = repo;
	}
	

}
