package co.simplon.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_id;
	
	@Column(nullable = false, length = 100)
	private String patient_firstname;
	
	@Column(nullable = false, length = 100)
	private String patient_name;
	
	@Column(nullable = false, length = 10)
	private String patient_gender;
	
	@Column(nullable = false)
	private int patient_age;
	
	@Column(nullable = false, length = 15, unique = true)
	private String patient_number;
	
	@OneToOne
	@JoinColumn(name = "id_bed", nullable = true)
	private Bed bed;

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_firstname() {
		return patient_firstname;
	}

	public void setPatient_firstname(String patient_firstname) {
		this.patient_firstname = patient_firstname;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_gender() {
		return patient_gender;
	}

	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}

	public int getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}

	public String getPatient_number() {
		return patient_number;
	}

	public void setPatient_number(String patient_number) {
		this.patient_number = patient_number;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
	
	

}
