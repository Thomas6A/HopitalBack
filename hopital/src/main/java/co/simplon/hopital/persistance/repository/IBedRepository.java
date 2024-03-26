package co.simplon.hopital.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Bed;

@Repository
public interface IBedRepository extends JpaRepository<Bed, Integer> {
	
	@Query("select b from Bed b where bed_statut = false")
	public List<Bed> getFreeBed();
}
