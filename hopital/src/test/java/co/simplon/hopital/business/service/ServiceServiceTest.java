package co.simplon.hopital.business.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.service.service.ServiceServiceImpl;
import co.simplon.hopital.persistance.repository.IServiceRepository;

@ExtendWith(MockitoExtension.class)
class ServiceServiceTest {
	
	@Mock
	IServiceRepository repo;
	
	@InjectMocks
	ServiceServiceImpl service;
	
	@Test
	void getAllServicetest() {
		service.getAllService();
		verify(repo, times(1)).findAll();
	}

}
