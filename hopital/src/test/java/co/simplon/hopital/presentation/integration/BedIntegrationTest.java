package co.simplon.hopital.presentation.integration;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class BedIntegrationTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void getAllBedTest() throws Exception {
		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/beds", String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}
	
	@Test
	void getAllFreeBedTest() throws Exception {
		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/freebeds", String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}

}
