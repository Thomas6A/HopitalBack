package co.simplon.hopital.business.service.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.hopital.business.convert.PatientConvert;
import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.service.bed.IBedService;
import co.simplon.hopital.persistance.repository.IPatientRepository;

@Service
public class PatientServiceImpl  implements IPatientService{
	
	private IPatientRepository repo;
	
	private IBedService bedservice;

	@Override
	public void createPatient(PatientDTO patient) {
		repo.save(PatientConvert.getInstance().convertDTOToEntity(patient));
		
	}

	@Override
	public void updatePatient(PatientDTO patient) {
		createPatient(patient);
		
	}

	@Override
	public void deletePatient(PatientDTO patient) {
		repo.delete(PatientConvert.getInstance().convertDTOToEntity(patient));
		
	}

	@Override
	public PatientDTO getPatient(int id) {
		return PatientConvert.getInstance().convertEntityToDTO(repo.getReferenceById(id));
	}

	@Override
	public List<PatientDTO> getAllPatient() {
		return PatientConvert.getInstance().convertListEntityToListDTO(repo.findAll());
	}

	@Override
	public void affectPatient(PatientDTO patient, BedDTO bed) {
		bed.setBedStatut(true);
		bedservice.updateBed(bed);
		if (patient.getBed() != null) {
			BedDTO patientBed = patient.getBed();
			patientBed.setBedStatut(false);
			bedservice.updateBed(patientBed);
		}
		patient.setBed(bed);
		updatePatient(patient);
	}

	@Override
	public void removePatient(PatientDTO patient) {
		BedDTO bed = patient.getBed();
		bed.setBedStatut(false);
		bedservice.updateBed(bed);
		patient.setBed(null);
		updatePatient(patient);
	}
	
	@Override
	public List<PatientDTO> getPatientFromService(final String name) {
		return PatientConvert.getInstance().convertListEntityToListDTO(repo.getPatientFromService(name));
	}

	@Autowired
	public void setRepo(IPatientRepository repo) {
		this.repo = repo;
	}

	@Autowired
	public void setBedservice(IBedService bedservice) {
		this.bedservice = bedservice;
	}
	
	
	
	
	
	

}
