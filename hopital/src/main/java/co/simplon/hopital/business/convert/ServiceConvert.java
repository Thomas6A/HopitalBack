package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.persistance.entity.Service;

public class ServiceConvert {
	
	private static ServiceConvert instance;
	
	public static ServiceConvert getInstance() {
		if(instance == null) {
			instance = new ServiceConvert();
		}
		return instance;
	}
	
	public ServiceDTO convertEntityToDTO(final Service entity) {
		ServiceDTO dto = new ServiceDTO();
		dto.setServiceId(entity.getServiceId());
		dto.setServiceName(entity.getServiceName());
		return dto;
	}
	
	public List<ServiceDTO> convertListEntityToListDTO(final List<Service> entities){
		List<ServiceDTO> dtos = new ArrayList<>();
		for (Service entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Service convertDTOToEntity(final ServiceDTO dto) {
		Service entity = new Service();
		entity.setServiceId(dto.getServiceId());
		entity.setServiceName(dto.getServiceName());
		return entity;
	}
	
	public List<Service> convertListDTOToListEntity(final List<ServiceDTO> dtos){
		List<Service> entities = new ArrayList<>();
		for (ServiceDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
