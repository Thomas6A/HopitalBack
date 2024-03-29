package co.simplon.hopital.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Bed;

/**
 * Repository interface for managing Bed entities.
 */
@Repository
public interface IBedRepository extends JpaRepository<Bed, Integer> {
	
	/**
	 * Retrieves a list of free beds.
	 * 
	 * @return A list of free beds.
	 */
	@Query("select b from Bed b where bedStatut = false")
	public List<Bed> getFreeBed();
}
