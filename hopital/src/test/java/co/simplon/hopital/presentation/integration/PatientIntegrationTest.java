package co.simplon.hopital.presentation.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.simplon.hopital.business.convert.BedConvert;
import co.simplon.hopital.business.convert.RoomConvert;
import co.simplon.hopital.business.convert.ServiceConvert;
import co.simplon.hopital.business.dto.BedDTO;
import co.simplon.hopital.business.dto.PatientDTO;
import co.simplon.hopital.business.dto.RoomDTO;
import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.business.service.patient.IPatientService;
import co.simplon.hopital.persistance.repository.IBedRepository;
import co.simplon.hopital.persistance.repository.IPatientRepository;
import co.simplon.hopital.persistance.repository.IRoomRepository;
import co.simplon.hopital.persistance.repository.IServiceRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestMethodOrder(OrderAnnotation.class)
class PatientIntegrationTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private IPatientService service;
	
	@Autowired
	private IPatientRepository repo;
	
	@Autowired
	private IServiceRepository servicerepo;
	
	@Autowired
	private IRoomRepository roomrepo;
	
	@Autowired
	private IBedRepository bedrepo;
	
	@BeforeEach
	public void setup() {
		
		repo.deleteAll();
		
		PatientDTO patient = new PatientDTO();
		patient.setPatientId(1);
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("zsdaqdvsdcsdu");
		
		service.createPatient(patient);
		
	}
	
	
	@Test
    void addPatientTest() {
		PatientDTO patient = new PatientDTO();
		patient.setPatientId(1);
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("zsdaqdvu");
		
        ResponseEntity<String> responseEntity = this.restTemplate.postForEntity("http://localhost:" + port + "/patients", patient, String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
        
    }
	
	@Test
	void deletePatientTest() {
		PatientDTO patient = new PatientDTO();
		patient.setPatientId(1);
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("zsdaqdvsdcsdu");
		
		ResponseEntity<Void> responseEntity = this.restTemplate.exchange(
                "http://localhost:" + port + "/patients",
                HttpMethod.DELETE,
                new HttpEntity<>(patient),
                Void.class
        );
		
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}
	
	@Test
	@Order(2)
	void affectPatientTest() {
		ServiceDTO service = new ServiceDTO();
		service.setServiceId(1);
		service.setServiceName("service");
		
		servicerepo.save(ServiceConvert.getInstance().convertDTOToEntity(service));
		
		RoomDTO room = new RoomDTO();
		room.setRoomId(1);
		room.setService(service);
		
		roomrepo.save(RoomConvert.getInstance().convertDTOToEntity(room));
		
		BedDTO bed = new BedDTO();
		bed.setBedId(1);
		bed.setBedStatut(false);
		bed.setRoom(room);
		
		bedrepo.save(BedConvert.getInstance().convertDTOToEntity(bed));
		
		ResponseEntity<Void> responseEntity = this.restTemplate.exchange(
                "http://localhost:" + port + "/affectPatients/2",
                HttpMethod.PUT,
                new HttpEntity<>(bed),
                Void.class
        );
		
		HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
		
	}
	
	@Test
	void getAllPatientTest() {
		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/patients", String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}
	
	@Test
	@Order(1)
	void getPatientTest() {
		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/patients/1", String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}
	
	@Test
	void getPatientFromServiceTest() {
		ServiceDTO servicedto = new ServiceDTO();
		servicedto.setServiceId(1);
		servicedto.setServiceName("service");
		
		servicerepo.save(ServiceConvert.getInstance().convertDTOToEntity(servicedto));
		
		RoomDTO room = new RoomDTO();
		room.setRoomId(1);
		room.setService(servicedto);
		
		roomrepo.save(RoomConvert.getInstance().convertDTOToEntity(room));
		
		BedDTO bed = new BedDTO();
		bed.setBedId(1);
		bed.setBedStatut(false);
		bed.setRoom(room);
		
		bedrepo.save(BedConvert.getInstance().convertDTOToEntity(bed));
		
		PatientDTO patient = new PatientDTO();
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("1212");
		patient.setBed(bed);
		
		service.createPatient(patient);
		
		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/patientsFromService/service", String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
		
	}
	
	@Test
	void removePatientTest() {
		PatientDTO patient = new PatientDTO();
		ServiceDTO servicedto = new ServiceDTO();
		servicedto.setServiceId(1);
		servicedto.setServiceName("service");
		
		servicerepo.save(ServiceConvert.getInstance().convertDTOToEntity(servicedto));
		
		RoomDTO room = new RoomDTO();
		room.setRoomId(1);
		room.setService(servicedto);
		
		roomrepo.save(RoomConvert.getInstance().convertDTOToEntity(room));
		
		BedDTO bed = new BedDTO();
		bed.setBedId(1);
		bed.setBedStatut(false);
		bed.setRoom(room);
		
		bedrepo.save(BedConvert.getInstance().convertDTOToEntity(bed));
		patient.setPatientId(1);
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("44444");
		patient.setBed(bed);
		
		ResponseEntity<Void> responseEntity = this.restTemplate.exchange(
                "http://localhost:" + port + "/removePatients",
                HttpMethod.PUT,
                new HttpEntity<>(patient),
                Void.class
        );
		
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}
	
	@Test
	void updatePatient() {
		PatientDTO patient = new PatientDTO();
		patient.setPatientId(1);
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("44444");
		
		ResponseEntity<Void> responseEntity = this.restTemplate.exchange(
                "http://localhost:" + port + "/patients",
                HttpMethod.PUT,
                new HttpEntity<>(patient),
                Void.class
        );
		
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}

}
