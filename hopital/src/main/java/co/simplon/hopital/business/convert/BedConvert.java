package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.persistance.entity.Bed;

public class BedConvert {
	
	private static BedConvert instance;
	
	public static BedConvert getInstance() {
		if (instance == null) {
			instance = new BedConvert();
		}
		return instance;
	}
	
	public BedDTO convertEntityToDTO(final Bed entity) {
		BedDTO dto = new BedDTO();
		dto.setBedId(entity.getBedId());
		dto.setBedStatut(entity.isBedStatut());
		dto.setRoom(RoomConvert.getInstance().convertEntityToDTO(entity.getRoom()));
		return dto;
	}
	
	public List<BedDTO> convertListEntityToListDTO(final List<Bed> entities){
		List<BedDTO> dtos = new ArrayList<>();
		for (Bed entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Bed convertDTOToEntity(final BedDTO dto) {
		Bed entity = new Bed();
		entity.setBedId(dto.getBedId());
		entity.setBedStatut(dto.isBedStatut());
		entity.setRoom(RoomConvert.getInstance().convertDTOToEntity(dto.getRoom()));
		return entity;
	}
	
	public List<Bed> convertListDTOToListEntity(final List<BedDTO> dtos) {
		List<Bed> entities = new ArrayList<>();
		for (BedDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
