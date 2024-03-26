package co.simplon.hopital.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.hopital.persistance.entity.Service;

public interface IServiceRepository extends JpaRepository<Service, Integer> {

}
