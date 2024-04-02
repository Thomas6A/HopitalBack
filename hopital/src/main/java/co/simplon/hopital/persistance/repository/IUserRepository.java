package co.simplon.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.hopital.persistance.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.userName = :username")
	User findUserByName(final String username);

}
