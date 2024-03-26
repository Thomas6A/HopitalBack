package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.DTO.PatientDTO;
import co.simplon.hopital.persistance.entity.Patient;

public class PatientConvert {
	
	private static PatientConvert instance;
	
	public static PatientConvert getInstance() {
		if (instance == null) {
			instance = new PatientConvert();
		}
		return instance;
	}
	
	public PatientDTO convertEntityToDTO(final Patient entity) {
		PatientDTO dto = new PatientDTO();
		dto.setPatient_id(entity.getPatient_id());
		dto.setPatient_firstname(entity.getPatient_firstname());
		dto.setPatient_name(entity.getPatient_name());
		dto.setPatient_gender(entity.getPatient_gender());
		dto.setPatient_age(entity.getPatient_age());
		dto.setPatient_number(entity.getPatient_number());
		dto.setBed(BedConvert.getInstance().convertEntityToDTO(entity.getBed()));
		return dto;
	}
	
	public List<PatientDTO> convertListEntityToListDTO(final List<Patient> entities){
		List<PatientDTO> dtos = new ArrayList<PatientDTO>();
		for (Patient entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Patient convertDTOToEntity(final PatientDTO dto) {
		Patient entity = new Patient();
		entity.setPatient_id(dto.getPatient_id());
		entity.setPatient_firstname(dto.getPatient_firstname());
		entity.setPatient_name(dto.getPatient_name());
		entity.setPatient_gender(dto.getPatient_gender());
		entity.setPatient_age(dto.getPatient_age());
		entity.setPatient_number(dto.getPatient_number());
		entity.setBed(BedConvert.getInstance().convertDTOToEntity(dto.getBed()));
		return entity;
	}
	
	public List<Patient> convertListDTOToListEntity(final List<PatientDTO> dtos){
		List<Patient> entities = new ArrayList<Patient>();
		for (PatientDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
