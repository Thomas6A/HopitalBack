package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.DTO.ServiceDTO;
import co.simplon.hopital.persistance.entity.Service;

public class ServiceConvert {
	
	public static ServiceConvert instance;
	
	public static ServiceConvert getInstance() {
		if(instance == null) {
			instance = new ServiceConvert();
		}
		return instance;
	}
	
	public ServiceDTO convertEntityToDTO(final Service entity) {
		ServiceDTO dto = new ServiceDTO();
		dto.setService_id(entity.getService_id());
		dto.setService_name(entity.getService_name());
		return dto;
	}
	
	public List<ServiceDTO> convertListEntityToListDTO(final List<Service> entities){
		List<ServiceDTO> dtos = new ArrayList<ServiceDTO>();
		for (Service entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Service convertDTOToEntity(final ServiceDTO dto) {
		Service entity = new Service();
		entity.setService_id(dto.getService_id());
		entity.setService_name(dto.getService_name());
		return entity;
	}
	
	public List<Service> convertListDTOToListEntity(final List<ServiceDTO> dtos){
		List<Service> entities = new ArrayList<Service>();
		for (ServiceDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
