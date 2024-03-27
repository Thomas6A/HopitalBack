package co.simplon.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	

}
