package co.simplon.hopital.business.DTO;

public class BedDTO {
	
	private int bed_id;
	
	private boolean bed_statut;
	
	private RoomDTO room;

	public int getBed_id() {
		return bed_id;
	}

	public void setBed_id(int bed_id) {
		this.bed_id = bed_id;
	}

	public boolean isBed_statut() {
		return bed_statut;
	}

	public void setBed_statut(boolean bed_statut) {
		this.bed_statut = bed_statut;
	}

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
	}
	
	

}
