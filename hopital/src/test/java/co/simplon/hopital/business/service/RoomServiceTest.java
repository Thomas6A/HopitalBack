package co.simplon.hopital.business.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.service.room.RoomServiceImpl;
import co.simplon.hopital.persistance.repository.IRoomRepository;

@ExtendWith(MockitoExtension.class)
class RoomServiceTest {
	
	@Mock
	IRoomRepository repo;
	
	@InjectMocks
	RoomServiceImpl service;
	
	@Test
	void getAllRoomtest() {
		service.getAllRoom();
		verify(repo, times(1)).findAll();
	}

}
