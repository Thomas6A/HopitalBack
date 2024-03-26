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
	private int bed_id;
	
	@Column(nullable = false)
	private boolean bed_statut;
	
	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;

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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	

}
