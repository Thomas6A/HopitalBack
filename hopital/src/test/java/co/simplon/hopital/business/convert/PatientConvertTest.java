package co.simplon.hopital.business.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.persistance.entity.Bed;
import co.simplon.hopital.persistance.entity.Patient;
import co.simplon.hopital.persistance.entity.Room;
import co.simplon.hopital.persistance.entity.Service;

class PatientConvertTest {

	@Test
	void convertEntityToDTOtest() {
		Patient patient = new Patient();
		patient.setPatientId(1);
		patient.setPatientFirstname("prenom");
		patient.setPatientName("name");
		patient.setPatientAge(21);
		patient.setPatientGender("gender");
		patient.setPatientNumber("number");
		
		Room room = new Room();
		room.setService(new Service());
		
		Bed bed = new Bed();
		bed.setRoom(room);
		
		patient.setBed(bed);
		
		PatientDTO dto = PatientConvert.getInstance().convertEntityToDTO(patient);
		
		assertEquals(patient.getPatientId(), dto.getPatientId());
		assertEquals(patient.getPatientFirstname(), dto.getPatientFirstname());
		assertEquals(patient.getPatientName(), dto.getPatientName());
		assertEquals(patient.getPatientAge(), dto.getPatientAge());
		assertEquals(patient.getPatientGender(), dto.getPatientGender());
		assertEquals(patient.getPatientNumber(), dto.getPatientNumber());
		assertEquals(patient.getBed().getBedId(), dto.getBed().getBedId());
	}
	
	@Test
	void convertListEntityToListDTOtest() {
		List<Patient> patients = new ArrayList<>();
		Patient patient = new Patient();
		patient.setPatientId(1);
		patient.setPatientFirstname("prenom");
		patient.setPatientName("name");
		patient.setPatientAge(21);
		patient.setPatientGender("gender");
		patient.setPatientNumber("number");
		
		Room room = new Room();
		room.setService(new Service());
		
		Bed bed = new Bed();
		bed.setRoom(room);
		
		patient.setBed(bed);
		patients.add(patient);
		
		List<PatientDTO> dtos = PatientConvert.getInstance().convertListEntityToListDTO(patients);
		
		assertEquals(patients.get(0).getPatientId(), dtos.get(0).getPatientId());
		assertEquals(patients.get(0).getPatientFirstname(), dtos.get(0).getPatientFirstname());
		assertEquals(patients.get(0).getPatientName(), dtos.get(0).getPatientName());
		assertEquals(patients.get(0).getPatientAge(), dtos.get(0).getPatientAge());
		assertEquals(patients.get(0).getPatientGender(), dtos.get(0).getPatientGender());
		assertEquals(patients.get(0).getPatientNumber(), dtos.get(0).getPatientNumber());
		assertEquals(patients.get(0).getBed().getBedId(), dtos.get(0).getBed().getBedId());
	}
	
	@Test
	void convertDTOToEntitytest() {
		PatientDTO patient = new PatientDTO();
		patient.setPatientId(1);
		patient.setPatientFirstname("prenom");
		patient.setPatientName("name");
		patient.setPatientAge(21);
		patient.setPatientGender("gender");
		patient.setPatientNumber("number");
		
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		
		BedDTO bed = new BedDTO();
		bed.setRoom(room);
		
		patient.setBed(bed);
		
		Patient entity = PatientConvert.getInstance().convertDTOToEntity(patient);
		
		assertEquals(patient.getPatientId(), entity.getPatientId());
		assertEquals(patient.getPatientFirstname(), entity.getPatientFirstname());
		assertEquals(patient.getPatientName(), entity.getPatientName());
		assertEquals(patient.getPatientAge(), entity.getPatientAge());
		assertEquals(patient.getPatientGender(), entity.getPatientGender());
		assertEquals(patient.getPatientNumber(), entity.getPatientNumber());
		assertEquals(patient.getBed().getBedId(), entity.getBed().getBedId());
	}
	
	@Test
	void convertListDTOToListEntitytest() {
		List<PatientDTO> patients = new ArrayList<>();
		PatientDTO patient = new PatientDTO();
		patient.setPatientId(1);
		patient.setPatientFirstname("prenom");
		patient.setPatientName("name");
		patient.setPatientAge(21);
		patient.setPatientGender("gender");
		patient.setPatientNumber("number");
		
		RoomDTO room = new RoomDTO();
		room.setService(new ServiceDTO());
		
		BedDTO bed = new BedDTO();
		bed.setRoom(room);
		
		patient.setBed(bed);
		patients.add(patient);
		
		List<Patient> entities = PatientConvert.getInstance().convertListDTOToListEntity(patients);
		
		assertEquals(patients.get(0).getPatientId(), entities.get(0).getPatientId());
		assertEquals(patients.get(0).getPatientFirstname(), entities.get(0).getPatientFirstname());
		assertEquals(patients.get(0).getPatientName(), entities.get(0).getPatientName());
		assertEquals(patients.get(0).getPatientAge(), entities.get(0).getPatientAge());
		assertEquals(patients.get(0).getPatientGender(), entities.get(0).getPatientGender());
		assertEquals(patients.get(0).getPatientNumber(), entities.get(0).getPatientNumber());
		assertEquals(patients.get(0).getBed().getBedId(), entities.get(0).getBed().getBedId());
	}

}
