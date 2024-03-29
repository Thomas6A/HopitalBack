package co.simplon.hopital.business.dto;

/**
 * DTO (Data Transfer Object) representing a bed in a hospital.
 */
public class BedDTO {
	
	private int bedId;
	
	private boolean bedStatut;
	
	private RoomDTO room;

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
	public RoomDTO getRoom() {
		return room;
	}

	/**
	 * Sets the room associated with the bed.
	 * 
	 * @param room The room to associate with the bed.
	 */
	public void setRoom(RoomDTO room) {
		this.room = room;
	}
	
	

}
