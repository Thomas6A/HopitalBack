package co.simplon.hopital.presentation.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.simplon.hopital.business.dto.PatientDTO;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PatientIntegrationTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
    void addPatientTest() {
		PatientDTO patient = new PatientDTO();
		patient.setPatientFirstname("cefa");
		patient.setPatientAge(1221);
		patient.setPatientGender("sdcvsqc");
		patient.setPatientName("dzeczéé&");
		patient.setPatientNumber("zsdaqdvu");
		
        ResponseEntity<String> responseEntity = this.restTemplate.postForEntity("http://localhost:" + port + "/patients", patient, String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
        
    }

}
