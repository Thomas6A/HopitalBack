package co.simplon.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents a bed in a hospital room.
 */
@Entity
@Table(name = "bed")
public class Bed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bed_id")
	private int bedId;
	
	@Column(nullable = false, name = "bed_statut")
	private boolean bedStatut;
	
	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;

	/**
	 * Gets the ID of the bed.
	 * 
	 * @return The bed ID.
	 */
	public int getBedId() {
		return bedId;
	}

	/**
	 * Sets the ID of the bed.
	 * 
	 * @param bedId The bed ID to set.
	 */
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	/**
	 * Checks if the bed is occupied or available.
	 * 
	 * @return True if the bed is occupied, false if it's available.
	 */
	public boolean isBedStatut() {
		return bedStatut;
	}

	/**
	 * Sets the status of the bed (occupied or available).
	 * 
	 * @param bedStatut The status of the bed to set.
	 */
	public void setBedStatut(boolean bedStatut) {
		this.bedStatut = bedStatut;
	}

	/**
	 * Gets the room associated with the bed.
	 * 
	 * @return The room associated with the bed.
	 */
	public Room getRoom() {
		return room;
	}
	
	/**
	 * Sets the room associated with the bed.
	 * 
	 * @param room The room to associate with the bed.
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
	
	

}
