package co.simplon.hopital.business.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.business.service.bed.BedServiceImpl;
import co.simplon.hopital.persistance.entity.Bed;
import co.simplon.hopital.persistance.repository.IBedRepository;

@ExtendWith(MockitoExtension.class)
class BedServiceTest {
	
	@Mock
	IBedRepository repo;
	
	@InjectMocks
	BedServiceImpl service;
	
	@Test
	void getAllBedtest() {
		service.getAllBed();
		verify(repo, times(1)).findAll();
	}
	
	@Test
	void getAllFreeBedtest() {
		service.getAllFreeBed();
		verify(repo, times(1)).getFreeBed();
	}
	
	@Test
	void updateBedtest() {
		BedDTO bed = new BedDTO();
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		bed.setRoom(room);
		service.updateBed(bed);
		verify(repo, times(1)).save(any(Bed.class));
	}

}
