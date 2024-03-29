package co.simplon.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents a room in a hospital.
 */
@Entity
@Table(name = "room")
public class Room {
	
	@Id
	@Column(name = "room_id")
	private int roomId;
	
	@ManyToOne
	@JoinColumn(name = "service_id", nullable = false)
	private Service service;

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
	public Service getService() {
		return service;
	}

	/**
	 * Sets the service associated with the room.
	 * 
	 * @param service The service to associate with the room.
	 */
	public void setService(Service service) {
		this.service = service;
	}
	
	

}
