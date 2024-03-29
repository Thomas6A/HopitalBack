package co.simplon.hopital.presentation.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.service.room.IRoomService;
import co.simplon.hopital.presentation.controller.room.GetAllRoomController;

@ExtendWith(MockitoExtension.class)
class RoomControllerTest {
	
	@Mock
	IRoomService service;
	
	@InjectMocks
	GetAllRoomController getAllRoomController;
	
	@Test
	void getAllRoomControllertest() {
		getAllRoomController.getAllRoom();
		verify(service, times(1)).getAllRoom();
	}

}
