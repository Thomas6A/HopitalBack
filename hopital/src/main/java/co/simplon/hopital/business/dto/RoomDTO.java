package co.simplon.hopital.business.dto;

/**
 * DTO (Data Transfer Object) representing a room in a hospital.
 */
public class RoomDTO {
	
	private int roomId;
	
	private ServiceDTO service;

	/**
	 * Gets the ID of the room.
	 * 
	 * @return The room ID.
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * Sets the ID of the room.
	 * 
	 * @param roomId The room ID to set.
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * Gets the service associated with the room.
	 * 
	 * @return The service associated with the room.
	 */
	public ServiceDTO getService() {
		return service;
	}

	/**
	 * Sets the service associated with the room.
	 * 
	 * @param service The service to associate with the room.
	 */
	public void setService(ServiceDTO service) {
		this.service = service;
	}
	
	

}
