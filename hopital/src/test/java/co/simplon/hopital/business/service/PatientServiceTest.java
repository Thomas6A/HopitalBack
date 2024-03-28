package co.simplon.hopital.business.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.business.service.bed.IBedService;
import co.simplon.hopital.business.service.patient.PatientServiceImpl;
import co.simplon.hopital.persistance.entity.Patient;
import co.simplon.hopital.persistance.repository.IPatientRepository;

@ExtendWith(MockitoExtension.class)
class PatientServiceTest {
	
	@Mock
	IPatientRepository repo;
	
	@Mock
	IBedService bedservice;
	
	@InjectMocks
	PatientServiceImpl service;
	
	@Test
	void createPatienttest() {
		PatientDTO patient = new PatientDTO();
		service.createPatient(patient);
		verify(repo, times(1)).save(any(Patient.class));
	}
	
	@Test
	void updatePatienttest() {
		PatientDTO patient = new PatientDTO();
		service.updatePatient(patient);
		verify(repo, times(1)).save(any(Patient.class));
	}
	
	@Test
	void deletePatienttest() {
		PatientDTO patient = new PatientDTO();
		service.deletePatient(patient);
		verify(repo, times(1)).delete(any(Patient.class));
	}
	
	@Test
	void getPatienttest() {
		when(repo.getReferenceById(1)).thenReturn(new Patient());
		service.getPatient(1);
		verify(repo, times(1)).getReferenceById(1);
	}
	
	@Test
	void getAllPatient() {
		service.getAllPatient();
		verify(repo, times(1)).findAll();
	}
	
	@Test 
	void affectPatienttest() {
		PatientDTO patient = new PatientDTO();
		BedDTO bed = new BedDTO();
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		bed.setRoom(room);
		patient.setBed(bed);
		service.affectPatient(patient, bed);
		verify(bedservice, times(2)).updateBed(any(BedDTO.class));
		verify(repo, times(1)).save(any(Patient.class));
	}
	
	
	@Test
	void removePatienttest() {
		PatientDTO patient = new PatientDTO();
		BedDTO bed = new BedDTO();
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		bed.setRoom(room);
		patient.setBed(bed);
		service.removePatient(patient);
		verify(bedservice, times(1)).updateBed(any(BedDTO.class));
		verify(repo, times(1)).save(any(Patient.class));
	}
	
	@Test
	void getPatientFromServicetest() {
		service.getPatientFromService("name");
		verify(repo, times(1)).getPatientFromService("name");
	}

}
