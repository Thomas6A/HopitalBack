package co.simplon.hopital.business.dto;

public class BedDTO {
	
	private int bedId;
	
	private boolean bedStatut;
	
	private RoomDTO room;

	public int getBedId() {
		return bedId;
	}

	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	public boolean isBedStatut() {
		return bedStatut;
	}

	public void setBedStatut(boolean bedStatut) {
		this.bedStatut = bedStatut;
	}

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
	}
	
	

}
