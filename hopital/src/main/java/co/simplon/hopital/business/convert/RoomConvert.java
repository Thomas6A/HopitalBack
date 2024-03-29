package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.persistance.entity.Room;

/**
 * Converter class for converting between Room entities and RoomDTOs.
 */
public class RoomConvert {
	
	private static RoomConvert instance;
	
	/**
	 * Gets the singleton instance of RoomConvert.
	 * 
	 * @return The singleton instance of RoomConvert.
	 */
	public static RoomConvert getInstance() {
		if(instance == null) {
			instance = new RoomConvert();
		}
		return instance;
	}
	
	/**
	 * Converts a Room entity to a RoomDTO.
	 * 
	 * @param entity The Room entity to convert.
	 * @return The corresponding RoomDTO.
	 */
	public RoomDTO convertEntityToDTO(final Room entity) {
		RoomDTO dto = new RoomDTO();
		dto.setRoomId(entity.getRoomId());
		dto.setService(ServiceConvert.getInstance().convertEntityToDTO(entity.getService()));
		return dto;
	}
	
	/**
	 * Converts a list of Room entities to a list of RoomDTOs.
	 * 
	 * @param entities The list of Room entities to convert.
	 * @return The corresponding list of RoomDTOs.
	 */
	public List<RoomDTO> convertListEntityToListDTO(final List<Room> entities){
		List<RoomDTO> dtos = new ArrayList<>();
		for (Room entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	/**
	 * Converts a RoomDTO to a Room entity.
	 * 
	 * @param dto The RoomDTO to convert.
	 * @return The corresponding Room entity.
	 */
	public Room convertDTOToEntity(final RoomDTO dto) {
		Room entity = new Room();
		entity.setRoomId(dto.getRoomId());
		entity.setService(ServiceConvert.getInstance().convertDTOToEntity(dto.getService()));
		return entity;
	}
	
	/**
	 * Converts a list of RoomDTOs to a list of Room entities.
	 * 
	 * @param dtos The list of RoomDTOs to convert.
	 * @return The corresponding list of Room entities.
	 */
	public List<Room> convertListDTOToListEntity(final List<RoomDTO> dtos){
		List<Room> entities = new ArrayList<>();
		for (RoomDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
