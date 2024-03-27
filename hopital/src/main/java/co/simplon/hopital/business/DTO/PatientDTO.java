package co.simplon.hopital.business.DTO;

public class PatientDTO {
	
	private int patient_id;
	
	private String patient_firstname;
	
	private String patient_name;
	
	private String patient_gender;
	
	private int patient_age;
	
	private String patient_number;
	
	private BedDTO bed;

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

	public BedDTO getBed() {
		return bed;
	}

	public void setBed(BedDTO bed) {
		this.bed = bed;
	}
	
	

}
