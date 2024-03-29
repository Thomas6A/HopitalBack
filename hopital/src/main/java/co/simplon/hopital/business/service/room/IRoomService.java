package co.simplon.hopital.business.service.room;

import java.util.List;

import co.simplon.hopital.business.dto.RoomDTO;

/**
 * Interface for managing operations related to Room entities.
 */
public interface IRoomService {
	
	/**
	 * Retrieves a list of all rooms.
	 * 
	 * @return The list of all RoomDTOs.
	 */
	public List<RoomDTO> getAllRoom();

}
