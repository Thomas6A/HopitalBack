package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.PatientDTO;
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
		dto.setPatientId(entity.getPatientId());
		dto.setPatientFirstname(entity.getPatientFirstname());
		dto.setPatientName(entity.getPatientName());
		dto.setPatientGender(entity.getPatientGender());
		dto.setPatientAge(entity.getPatientAge());
		dto.setPatientNumber(entity.getPatientNumber());
		if (entity.getBed() != null) {
			dto.setBed(BedConvert.getInstance().convertEntityToDTO(entity.getBed()));
		}
		return dto;
	}
	
	public List<PatientDTO> convertListEntityToListDTO(final List<Patient> entities){
		List<PatientDTO> dtos = new ArrayList<>();
		for (Patient entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}
	
	public Patient convertDTOToEntity(final PatientDTO dto) {
		Patient entity = new Patient();
		entity.setPatientId(dto.getPatientId());
		entity.setPatientFirstname(dto.getPatientFirstname());
		entity.setPatientName(dto.getPatientName());
		entity.setPatientGender(dto.getPatientGender());
		entity.setPatientAge(dto.getPatientAge());
		entity.setPatientNumber(dto.getPatientNumber());
		if (dto.getBed() != null) {
			entity.setBed(BedConvert.getInstance().convertDTOToEntity(dto.getBed()));
		}
		return entity;
	}
	
	public List<Patient> convertListDTOToListEntity(final List<PatientDTO> dtos){
		List<Patient> entities = new ArrayList<>();
		for (PatientDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}

}
