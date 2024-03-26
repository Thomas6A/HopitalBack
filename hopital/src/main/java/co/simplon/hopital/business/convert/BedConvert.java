package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.DTO.BedDTO;
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
		dto.setBed_id(entity.getBed_id());
		dto.setBed_statut(entity.isBed_statut());
		dto.setRoom(RoomConvert.getInstance().convertEntityToDTO(entity.getRoom()));
		return dto;
	}
	
	public List<BedDTO> convertListEntityToListDTO(final List<Bed> entities){
		List<BedDTO> dtos = new ArrayList<BedDTO>();
		for (Bed entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Bed convertDTOToEntity(final BedDTO dto) {
		Bed entity = new Bed();
		entity.setBed_id(dto.getBed_id());
		entity.setBed_statut(dto.isBed_statut());
		entity.setRoom(RoomConvert.getInstance().convertDTOToEntity(dto.getRoom()));
		return entity;
	}
	
	public List<Bed> convertListDTOToListEntity(final List<BedDTO> dtos) {
		List<Bed> entities = new ArrayList<Bed>();
		for (BedDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
