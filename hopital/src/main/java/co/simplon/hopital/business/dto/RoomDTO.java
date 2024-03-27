package co.simplon.hopital.business.dto;

public class RoomDTO {
	
	private int roomId;
	
	private ServiceDTO service;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public ServiceDTO getService() {
		return service;
	}

	public void setService(ServiceDTO service) {
		this.service = service;
	}
	
	

}
