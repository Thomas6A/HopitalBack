package co.simplon.hopital.presentation.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.service.service.IServiceService;
import co.simplon.hopital.presentation.controller.service.GetAllServiceController;

@ExtendWith(MockitoExtension.class)
class ServiceControllerTest {
	
	@Mock
	IServiceService service;
	
	@InjectMocks
	GetAllServiceController getAllServiceController;
	
	@Test
	void getAllServiceControllertest() {
		getAllServiceController.getAllService();
		verify(service, times(1)).getAllService();
	}

}
