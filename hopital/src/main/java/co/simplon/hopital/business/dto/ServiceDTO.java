package co.simplon.hopital.business.dto;

/**
 * DTO (Data Transfer Object) representing a service in a hospital.
 */
public class ServiceDTO {
	
	private int serviceId;
	
	private String serviceName;

	/**
	 * Gets the ID of the service.
	 * 
	 * @return The service ID.
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * Sets the ID of the service.
	 * 
	 * @param serviceId The service ID to set.
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * Gets the name of the service.
	 * 
	 * @return The service name.
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Sets the name of the service.
	 * 
	 * @param serviceName The service name to set.
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	

}
