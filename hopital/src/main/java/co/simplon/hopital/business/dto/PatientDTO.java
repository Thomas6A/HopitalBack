package co.simplon.hopital.business.dto;

/**
 * DTO (Data Transfer Object) representing a patient in a hospital.
 */
public class PatientDTO {
	
	private int patientId;
	
	private String patientFirstname;
	
	private String patientName;
	
	private String patientGender;
	
	private int patientAge;
	
	private String patientNumber;
	
	private BedDTO bed;

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
	 * Sets the patient number.
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
	public BedDTO getBed() {
		return bed;
	}

	/**
	 * Sets the bed associated with the patient.
	 * 
	 * @param bed The bed to associate with the patient.
	 */
	public void setBed(BedDTO bed) {
		this.bed = bed;
	}
	
	

}
