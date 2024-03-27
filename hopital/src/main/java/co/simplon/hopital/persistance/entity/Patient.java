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
	@Column(name = "patient_id")
	private int patientId;
	
	@Column(nullable = false, length = 100, name = "patient_firstname")
	private String patientFirstname;
	
	@Column(nullable = false, length = 100, name = "patient_name")
	private String patientName;
	
	@Column(nullable = false, length = 10, name = "patient_gender")
	private String patientGender;
	
	@Column(nullable = false, name = "patient_age")
	private int patientAge;
	
	@Column(nullable = false, length = 15, unique = true, name = "patient_number")
	private String patientNumber;
	
	@OneToOne
	@JoinColumn(name = "id_bed", nullable = true)
	private Bed bed;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientFirstname() {
		return patientFirstname;
	}

	public void setPatientFirstname(String patientFirstname) {
		this.patientFirstname = patientFirstname;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
	
	

}
