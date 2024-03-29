package co.simplon.hopital.business.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.simplon.hopital.business.dto.ServiceDTO;
import co.simplon.hopital.persistance.entity.Service;

class ServiceConvertTest {
	
	@Test
	void convertEntityToDTOtest() {
		Service service = new Service();
		service.setServiceId(1);
		service.setServiceName("name");
		
		ServiceDTO servicedto = ServiceConvert.getInstance().convertEntityToDTO(service);
		
		assertEquals(service.getServiceId(), servicedto.getServiceId());
		assertEquals(service.getServiceName(), servicedto.getServiceName());
	}
	
	@Test
	void convertListEntityToListDTOtest() {
		List<Service> services = new ArrayList<>();
		Service service = new Service();
		service.setServiceId(1);
		service.setServiceName("name");
		services.add(service);
		
		List<ServiceDTO> servicedtos = ServiceConvert.getInstance().convertListEntityToListDTO(services);
		
		assertEquals(services.get(0).getServiceId(), servicedtos.get(0).getServiceId());
		assertEquals(services.get(0).getServiceName(), servicedtos.get(0).getServiceName());
	}
	
	@Test
	void convertDTOToEntitytest() {
		ServiceDTO servicedto = new ServiceDTO();
		servicedto.setServiceId(1);
		servicedto.setServiceName("name");
		
		Service service = ServiceConvert.getInstance().convertDTOToEntity(servicedto);
		
		assertEquals(service.getServiceId(), servicedto.getServiceId());
		assertEquals(service.getServiceName(), servicedto.getServiceName());
	}
	
	@Test
	void convertListDTOToListEntitytest() {
		List<ServiceDTO> servicedtos = new ArrayList<>();
		ServiceDTO service = new ServiceDTO();
		service.setServiceId(1);
		service.setServiceName("name");
		servicedtos.add(service);
		
		List<Service> services = ServiceConvert.getInstance().convertListDTOToListEntity(servicedtos);
		
		assertEquals(services.get(0).getServiceId(), servicedtos.get(0).getServiceId());
		assertEquals(services.get(0).getServiceName(), servicedtos.get(0).getServiceName());
	}

}
