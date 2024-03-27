package co.simplon.hopital.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {
	
	@Query("select p from Patient p join p.bed b join b.room r join r.service s where s.service_name = :name")
	public List<Patient> getPatientFromService(final String name);

}
