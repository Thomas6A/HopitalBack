package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.persistance.entity.Bed;

/**
 * Converter class for converting between Bed entities and BedDTOs.
 */
public class BedConvert {
	
	private static BedConvert instance;
	
	/**
	 * Gets the singleton instance of BedConvert.
	 * 
	 * @return The singleton instance of BedConvert.
	 */
	public static BedConvert getInstance() {
		if (instance == null) {
			instance = new BedConvert();
		}
		return instance;
	}
	
	/**
	 * Converts a Bed entity to a BedDTO.
	 * 
	 * @param entity The Bed entity to convert.
	 * @return The corresponding BedDTO.
	 */
	public BedDTO convertEntityToDTO(final Bed entity) {
		BedDTO dto = new BedDTO();
		dto.setBedId(entity.getBedId());
		dto.setBedStatut(entity.isBedStatut());
		dto.setRoom(RoomConvert.getInstance().convertEntityToDTO(entity.getRoom()));
		return dto;
	}
	
	/**
	 * Converts a list of Bed entities to a list of BedDTOs.
	 * 
	 * @param entities The list of Bed entities to convert.
	 * @return The corresponding list of BedDTOs.
	 */
	public List<BedDTO> convertListEntityToListDTO(final List<Bed> entities){
		List<BedDTO> dtos = new ArrayList<>();
		for (Bed entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	/**
	 * Converts a BedDTO to a Bed entity.
	 * 
	 * @param dto The BedDTO to convert.
	 * @return The corresponding Bed entity.
	 */
	public Bed convertDTOToEntity(final BedDTO dto) {
		Bed entity = new Bed();
		entity.setBedId(dto.getBedId());
		entity.setBedStatut(dto.isBedStatut());
		entity.setRoom(RoomConvert.getInstance().convertDTOToEntity(dto.getRoom()));
		return entity;
	}
	
	/**
	 * Converts a list of BedDTOs to a list of Bed entities.
	 * 
	 * @param dtos The list of BedDTOs to convert.
	 * @return The corresponding list of Bed entities.
	 */
	public List<Bed> convertListDTOToListEntity(final List<BedDTO> dtos) {
		List<Bed> entities = new ArrayList<>();
		for (BedDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
