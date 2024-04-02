package co.simplon.hopital.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.hopital.business.dto.UserDTO;
import co.simplon.hopital.persistance.entity.User;

public class UserConvert {
	
	private static UserConvert instance;
	
	public static UserConvert getInstance() {
		if(instance == null) {
			instance = new UserConvert();
		}
		return instance;
	}
	
	public User convertDTOToEntity(final UserDTO dto) {
		User entity = new User();
		entity.setUserId(dto.getIdUser());
		entity.setUserName(dto.getUserName());
		entity.setUserPassword(dto.getUserPassword());
		entity.setUserRole(dto.getUserRole());
		entity.setService(ServiceConvert.getInstance().convertDTOToEntity(dto.getService()));
		return entity;
	}
	
	public List<User> convertListDTOToListUser(final List<UserDTO> dtos) {
		List<User> entities = new ArrayList<>();
		for (UserDTO dto : dtos) {
			entities.add(convertDTOToEntity(dto));
		}
		return entities;
	}
	
	public UserDTO convertEntityToDTO(final User entity) {
		UserDTO dto = new UserDTO();
		dto.setIdUser(entity.getUserId());
		dto.setUserName(entity.getUserName());
		dto.setUserPassword(entity.getUserPassword());
		dto.setUserRole(entity.getUserRole());
		dto.setService(ServiceConvert.getInstance().convertEntityToDTO(entity.getService()));
		return dto;
	}
	
	public List<UserDTO> convertListEntityToListDTO(final List<User> entities) {
		List<UserDTO> dtos = new ArrayList<>();
		for (User entity : entities) {
			dtos.add(convertEntityToDTO(entity));
		}
		return dtos;
	}

}
