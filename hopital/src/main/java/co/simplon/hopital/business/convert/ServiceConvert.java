package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.persistance.entity.Service;

/**
 * Converter class for converting between Service entities and ServiceDTOs.
 */
public class ServiceConvert {
	
	private static ServiceConvert instance;
	
	/**
	 * Gets the singleton instance of ServiceConvert.
	 * 
	 * @return The singleton instance of ServiceConvert.
	 */
	public static ServiceConvert getInstance() {
		if(instance == null) {
			instance = new ServiceConvert();
		}
		return instance;
	}
	
	/**
	 * Converts a Service entity to a ServiceDTO.
	 * 
	 * @param entity The Service entity to convert.
	 * @return The corresponding ServiceDTO.
	 */
	public ServiceDTO convertEntityToDTO(final Service entity) {
		ServiceDTO dto = new ServiceDTO();
		dto.setServiceId(entity.getServiceId());
		dto.setServiceName(entity.getServiceName());
		return dto;
	}
	
	/**
	 * Converts a list of Service entities to a list of ServiceDTOs.
	 * 
	 * @param entities The list of Service entities to convert.
	 * @return The corresponding list of ServiceDTOs.
	 */
	public List<ServiceDTO> convertListEntityToListDTO(final List<Service> entities){
		List<ServiceDTO> dtos = new ArrayList<>();
		for (Service entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	/**
	 * Converts a ServiceDTO to a Service entity.
	 * 
	 * @param dto The ServiceDTO to convert.
	 * @return The corresponding Service entity.
	 */
	public Service convertDTOToEntity(final ServiceDTO dto) {
		Service entity = new Service();
		entity.setServiceId(dto.getServiceId());
		entity.setServiceName(dto.getServiceName());
		return entity;
	}
	
	/**
	 * Converts a list of ServiceDTOs to a list of Service entities.
	 * 
	 * @param dtos The list of ServiceDTOs to convert.
	 * @return The corresponding list of Service entities.
	 */
	public List<Service> convertListDTOToListEntity(final List<ServiceDTO> dtos){
		List<Service> entities = new ArrayList<>();
		for (ServiceDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
