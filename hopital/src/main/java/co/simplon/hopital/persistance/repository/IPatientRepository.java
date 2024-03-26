package co.simplon.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}
