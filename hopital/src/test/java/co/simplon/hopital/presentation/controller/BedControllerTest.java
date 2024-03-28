package co.simplon.hopital.presentation.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.hopital.business.service.bed.IBedService;
import co.simplon.hopital.presentation.controller.bed.GetAllBedController;
import co.simplon.hopital.presentation.controller.bed.GetAllFreeBedController;

@ExtendWith(MockitoExtension.class)
class BedControllerTest {
	
	@Mock
	IBedService service;
	
	@InjectMocks
	GetAllBedController getAllBedController;
	
	@InjectMocks
	GetAllFreeBedController getAllFreeBedController;
	
	@Test
	void getAllBedControllertest() {
		getAllBedController.getAllBed();
		verify(service, times(1)).getAllBed();
	}
	
	@Test
	void getAllFreeBedControllertest() {
		getAllFreeBedController.getAllFreeBed();
		verify(service, times(1)).getAllFreeBed();
	}
	

}
