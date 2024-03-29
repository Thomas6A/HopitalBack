package co.simplon.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Represents a patient in a hospital.
 */
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

	/**
	 * Gets the ID of the patient.
	 * 
	 * @return The patient ID.
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * Sets the ID of the patient.
	 * 
	 * @param patientId The patient ID to set.
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	/**
	 * Gets the first name of the patient.
	 * 
	 * @return The first name of the patient.
	 */
	public String getPatientFirstname() {
		return patientFirstname;
	}

	/**
	 * Sets the first name of the patient.
	 * 
	 * @param patientFirstname The first name of the patient to set.
	 */
	public void setPatientFirstname(String patientFirstname) {
		this.patientFirstname = patientFirstname;
	}

	/**
	 * Gets the last name of the patient.
	 * 
	 * @return The last name of the patient.
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * Sets the last name of the patient.
	 * 
	 * @param patientName The last name of the patient to set.
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * Gets the gender of the patient.
	 * 
	 * @return The gender of the patient.
	 */
	public String getPatientGender() {
		return patientGender;
	}

	/**
	 * Sets the gender of the patient.
	 * 
	 * @param patientGender The gender of the patient to set.
	 */
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	/**
	 * Gets the age of the patient.
	 * 
	 * @return The age of the patient.
	 */
	public int getPatientAge() {
		return patientAge;
	}

	/**
	 * Sets the age of the patient.
	 * 
	 * @param patientAge The age of the patient to set.
	 */
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	/**
	 * Gets the patient secu-number.
	 * 
	 * @return The patient secu-number.
	 */
	public String getPatientNumber() {
		return patientNumber;
	}

	/**
	 * Sets the patient secu-number.
	 * 
	 * @param patientNumber The patient secu-number to set.
	 */
	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	/**
	 * Gets the bed associated with the patient.
	 * 
	 * @return The bed associated with the patient.
	 */
	public Bed getBed() {
		return bed;
	}

	/**
	 * Sets the bed associated with the patient.
	 * 
	 * @param bed The bed to associate with the patient.
	 */
	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
	
	

}
