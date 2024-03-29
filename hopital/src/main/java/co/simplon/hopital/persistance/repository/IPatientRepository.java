package co.simplon.hopital.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Patient;

/**
 * Repository interface for managing Patient entities.
 */
@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {
	
	/**
	 * Retrieves a list of patients from a specific service.
	 * 
	 * @param name The name of the service to filter patients.
	 * @return A list of patients from the specified service.
	 */
	@Query("select p from Patient p join p.bed b join b.room r join r.service s where s.serviceName = :name")
	public List<Patient> getPatientFromService(final String name);

}
