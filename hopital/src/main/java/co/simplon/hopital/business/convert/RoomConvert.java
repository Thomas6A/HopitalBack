package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.persistance.entity.Room;

public class RoomConvert {
	
	private static RoomConvert instance;
	
	public static RoomConvert getInstance() {
		if(instance == null) {
			instance = new RoomConvert();
		}
		return instance;
	}
	
	public RoomDTO convertEntityToDTO(final Room entity) {
		RoomDTO dto = new RoomDTO();
		dto.setRoomId(entity.getRoomId());
		dto.setService(ServiceConvert.getInstance().convertEntityToDTO(entity.getService()));
		return dto;
	}
	
	public List<RoomDTO> convertListEntityToListDTO(final List<Room> entities){
		List<RoomDTO> dtos = new ArrayList<>();
		for (Room entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Room convertDTOToEntity(final RoomDTO dto) {
		Room entity = new Room();
		entity.setRoomId(dto.getRoomId());
		entity.setService(ServiceConvert.getInstance().convertDTOToEntity(dto.getService()));
		return entity;
	}
	
	public List<Room> convertListDTOToListEntity(final List<RoomDTO> dtos){
		List<Room> entities = new ArrayList<>();
		for (RoomDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
