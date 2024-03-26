package co.simplon.hopital.business.DTO;

public class RoomDTO {
	
	private int room_id;
	
	private ServiceDTO service;

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public ServiceDTO getService() {
		return service;
	}

	public void setService(ServiceDTO service) {
		this.service = service;
	}
	
	

}
