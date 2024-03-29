package co.simplon.hopital.business.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.persistance.entity.Room;
import co.simplon.hopital.persistance.entity.Service;

class RoomConvertTest {
	
	@Test
	void convertEntityToDTOtest() {
		Room room = new Room();
		room.setRoomId(1);
		room.setService(new Service());
		
		RoomDTO roomdto = RoomConvert.getInstance().convertEntityToDTO(room);
		
		assertEquals(room.getRoomId(), roomdto.getRoomId());
		assertEquals(room.getService().getServiceId(), roomdto.getService().getServiceId());
	}
	
	@Test
	void convertListEntityToListDTOtest() {
		List<Room> rooms = new ArrayList<>();
		Room room = new Room();
		room.setRoomId(1);
		room.setService(new Service());
		rooms.add(room);
		
		List<RoomDTO> roomdtos = RoomConvert.getInstance().convertListEntityToListDTO(rooms);
		
		assertEquals(rooms.get(0).getRoomId(), roomdtos.get(0).getRoomId());
		assertEquals(rooms.get(0).getService().getServiceId(), roomdtos.get(0).getService().getServiceId());
	}
	
	@Test
	void convertDTOToEntitytest() {
		RoomDTO roomdto = new RoomDTO();
		roomdto.setRoomId(1);
		roomdto.setService(new ServiceDTO());
		
		Room room = RoomConvert.getInstance().convertDTOToEntity(roomdto);
		
		assertEquals(room.getRoomId(), roomdto.getRoomId());
		assertEquals(room.getService().getServiceId(), roomdto.getService().getServiceId());
	}
	
	@Test
	void convertListDTOToListEntitytest() {
		List<RoomDTO> roomdtos = new ArrayList<>();
		RoomDTO room = new RoomDTO();
		room.setRoomId(1);
		room.setService(new ServiceDTO());
		roomdtos.add(room);
		
		List<Room> rooms = RoomConvert.getInstance().convertListDTOToListEntity(roomdtos);
		
		assertEquals(rooms.get(0).getRoomId(), roomdtos.get(0).getRoomId());
		assertEquals(rooms.get(0).getService().getServiceId(), roomdtos.get(0).getService().getServiceId());
	}

}
