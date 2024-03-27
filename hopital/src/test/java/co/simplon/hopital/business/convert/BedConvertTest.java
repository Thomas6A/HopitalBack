package co.simplon.hopital.business.convert;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.persistance.entity.Bed;
import co.simplon.hopital.persistance.entity.Room;
import co.simplon.hopital.persistance.entity.Service;

class BedConvertTest {

	@Test
	void convertEntityToDTOtest() {
		Bed bed = new Bed();
		bed.setBedId(1);
		bed.setBedStatut(false);
		Room room = new Room();
		room.setService(new Service());
		bed.setRoom(room);
		
		BedDTO beddto = BedConvert.getInstance().convertEntityToDTO(bed);
		
		assertEquals(bed.getBedId(), beddto.getBedId());
		assertEquals(bed.isBedStatut(), beddto.isBedStatut());
		assertEquals(bed.getRoom().getRoomId(), beddto.getRoom().getRoomId());
	}
	
	@Test
	void convertListEntityToListDTOtest() {
		List<Bed> beds = new ArrayList<>();

		Bed bed = new Bed();
		bed.setBedId(1);
		bed.setBedStatut(false);
		Room room = new Room();
		room.setService(new Service());
		bed.setRoom(room);
		
		beds.add(bed);
		
		List<BedDTO> beddtos = BedConvert.getInstance().convertListEntityToListDTO(beds);
		
		assertEquals(beds.get(0).getBedId(), beddtos.get(0).getBedId());
		assertEquals(beds.get(0).isBedStatut(), beddtos.get(0).isBedStatut());
		assertEquals(beds.get(0).getRoom().getRoomId(), beddtos.get(0).getRoom().getRoomId());
	}
	
	@Test
	void convertDTOToEntitytest() {
		BedDTO beddto = new BedDTO();
		beddto.setBedId(1);
		beddto.setBedStatut(false);
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		beddto.setRoom(room);
		
		Bed bed = BedConvert.getInstance().convertDTOToEntity(beddto);
		
		assertEquals(bed.getBedId(), beddto.getBedId());
		assertEquals(bed.isBedStatut(), beddto.isBedStatut());
		assertEquals(bed.getRoom().getRoomId(), beddto.getRoom().getRoomId());
	}
	
	@Test
	void convertListDTOToListEntitytest() {
		List<BedDTO> beddtos = new ArrayList<>();

		BedDTO beddto = new BedDTO();
		beddto.setBedId(1);
		beddto.setBedStatut(false);
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		beddto.setRoom(room);
		
		beddtos.add(beddto);
		
		List<Bed> beds = BedConvert.getInstance().convertListDTOToListEntity(beddtos);
		
		assertEquals(beds.get(0).getBedId(), beddtos.get(0).getBedId());
		assertEquals(beds.get(0).isBedStatut(), beddtos.get(0).isBedStatut());
		assertEquals(beds.get(0).getRoom().getRoomId(), beddtos.get(0).getRoom().getRoomId());
	}

}
