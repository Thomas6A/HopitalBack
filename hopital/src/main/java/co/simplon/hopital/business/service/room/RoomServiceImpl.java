package co.simplon.hopital.business.service.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.hopital.business.convert.RoomConvert;
import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.persistance.repository.IRoomRepository;

@Service
public class RoomServiceImpl implements IRoomService {
	
	private IRoomRepository repo;

	@Override
	public List<RoomDTO> getAllRoom() {
		return RoomConvert.getInstance().convertListEntityToListDTO(repo.findAll());
	}

	@Autowired
	public void setRepo(IRoomRepository repo) {
		this.repo = repo;
	}
	
	

}
