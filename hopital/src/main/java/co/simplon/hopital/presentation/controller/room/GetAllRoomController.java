package co.simplon.hopital.presentation.controller.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.service.room.IRoomService;

@RestController
@CrossOrigin
public class GetAllRoomController {
	
	private IRoomService service;
	
	@GetMapping("/rooms")
	public List<RoomDTO> getAllRoom(){
		return service.getAllRoom();
	}

	@Autowired
	public void setService(IRoomService service) {
		this.service = service;
	}
	
	

}
