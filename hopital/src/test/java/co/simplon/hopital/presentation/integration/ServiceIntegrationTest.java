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

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ServiceIntegrationTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void getAllServiceTest() throws Exception {
		ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/services", String.class);
        HttpStatus statusCode = (HttpStatus) responseEntity.getStatusCode();

        assertEquals(HttpStatus.OK, statusCode);
	}

}
