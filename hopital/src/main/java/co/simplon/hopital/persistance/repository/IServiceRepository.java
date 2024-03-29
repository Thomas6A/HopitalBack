package co.simplon.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Service;

/**
 * Repository interface for managing Service entities.
 */
@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {

}
