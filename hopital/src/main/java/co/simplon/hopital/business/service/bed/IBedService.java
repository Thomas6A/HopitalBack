package co.simplon.hopital.business.service.bed;

import java.util.List;

import co.simplon.hopital.business.dto.BedDTO;

/**
 * Interface for managing operations related to Bed entities.
 */
public interface IBedService {
	
	/**
	 * Retrieves a list of all beds.
	 * 
	 * @return The list of all BedDTOs.
	 */
	public List<BedDTO> getAllBed();
	
	/**
	 * Retrieves a list of all free beds.
	 * 
	 * @return The list of all free BedDTOs.
	 */
	public List<BedDTO> getAllFreeBed();
	
	/**
	 * Updates the information of a bed.
	 * 
	 * @param bed The BedDTO containing updated information.
	 */
	public void updateBed(final BedDTO bed);

}
