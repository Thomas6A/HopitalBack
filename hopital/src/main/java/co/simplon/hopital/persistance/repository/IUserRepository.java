package co.simplon.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.simplon.hopital.persistance.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.user_name = :username")
	User findUserByName(final String username);

}
