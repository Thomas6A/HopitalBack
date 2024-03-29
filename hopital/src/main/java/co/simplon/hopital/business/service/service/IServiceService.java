package co.simplon.hopital.business.service.service;

import java.util.List;

import co.simplon.hopital.business.dto.ServiceDTO;

/**
 * Interface for managing operations related to Service entities.
 */
public interface IServiceService {
	
	/**
	 * Retrieves a list of all services.
	 * 
	 * @return The list of all ServiceDTOs.
	 */
	public List<ServiceDTO> getAllService();

}
