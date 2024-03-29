package co.simplon.hopital.presentation.controller;

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
import co.simplon.hopital.business.service.patient.IPatientService;
import co.simplon.hopital.presentation.controller.patient.AffectPatientController;
import co.simplon.hopital.presentation.controller.patient.CreatePatientController;
import co.simplon.hopital.presentation.controller.patient.DeletePatientController;
import co.simplon.hopital.presentation.controller.patient.GetAllPatientController;
import co.simplon.hopital.presentation.controller.patient.GetPatientController;
import co.simplon.hopital.presentation.controller.patient.GetPatientFromServiceController;
import co.simplon.hopital.presentation.controller.patient.RemovePatientController;
import co.simplon.hopital.presentation.controller.patient.UpdatePatientController;

@ExtendWith(MockitoExtension.class)
class PatientControllerTest {
	
	@Mock
	IPatientService service;
	
	@InjectMocks
	AffectPatientController affectPatientController;
	
	@InjectMocks
	CreatePatientController createPatientController;
	
	@InjectMocks
	DeletePatientController deletePatientController;
	
	@InjectMocks
	GetAllPatientController getAllPatientController;
	
	@InjectMocks
	GetPatientController getPatientController;
	
	@InjectMocks
	GetPatientFromServiceController getPatientFromServiceController;
	
	@InjectMocks
	RemovePatientController removePatientController;
	
	@InjectMocks
	UpdatePatientController updatePatientController;
	
	@Test
	void affectPatientControllertest() {
		PatientDTO patient = new PatientDTO();
		BedDTO bed = new BedDTO();
		when(service.getPatient(1)).thenReturn(patient);
		affectPatientController.affectPatient(1, bed);
		verify(service, times(1)).affectPatient(patient, bed);
	}
	
	@Test
	void createPatientControllertest() {
		PatientDTO patient = new PatientDTO();
		createPatientController.createPatient(patient);
		verify(service, times(1)).createPatient(patient);
	}
	
	@Test
	void deletePatientControllertest() {
		PatientDTO patient = new PatientDTO();
		deletePatientController.deletePatient(patient);
		verify(service, times(1)).deletePatient(patient);
	}
	
	@Test
	void getAllPatientController() {
		getAllPatientController.getAllPatients();
		verify(service, times(1)).getAllPatient();
	}
	
	@Test
	void getPatientController() {
		getPatientController.getPatient(1);
		verify(service, times(1)).getPatient(1);
	}
	
	@Test
	void getPatientFromServiceControllertest() {
		getPatientFromServiceController.getPatientFromService("name");
		verify(service, times(1)).getPatientFromService("name");
	}
	
	@Test
	void removePatientControllertest() {
		PatientDTO patient = new PatientDTO();
		removePatientController.removePatient(patient);
		verify(service, times(1)).removePatient(patient);
	}
	
	@Test
	void updatePatientControllertest() {
		PatientDTO patient = new PatientDTO();
		updatePatientController.updatePatient(patient);
		verify(service, times(1)).updatePatient(patient);
	}

}
