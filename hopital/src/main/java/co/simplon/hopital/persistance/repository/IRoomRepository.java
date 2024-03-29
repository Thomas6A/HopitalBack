package co.simplon.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.Room;


/**
 * Repository interface for managing Room entities.
 */
@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer>{

}
