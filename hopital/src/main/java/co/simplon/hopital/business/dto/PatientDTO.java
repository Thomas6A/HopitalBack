package co.simplon.hopital.business.dto;

public class PatientDTO {
	
	private int patientId;
	
	private String patientFirstname;
	
	private String patientName;
	
	private String patientGender;
	
	private int patientAge;
	
	private String patientNumber;
	
	private BedDTO bed;

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

	public BedDTO getBed() {
		return bed;
	}

	public void setBed(BedDTO bed) {
		this.bed = bed;
	}
	
	

}
