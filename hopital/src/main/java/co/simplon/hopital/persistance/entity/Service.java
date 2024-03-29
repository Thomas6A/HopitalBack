package co.simplon.hopital.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a service in a hospital.
 */
@Entity
@Table(name="service")
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private int serviceId;
	
	@Column(nullable = false, length = 50, name = "service_name")
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
