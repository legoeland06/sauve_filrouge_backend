package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Adresse;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository  extends JpaRepository<Adresse, Long>{

	List<Adresse> findByVilleContains(String element);
	List<Adresse> findByRueContains(String element);
	List<Adresse> findByCpContains(String element);
	List<Adresse> findByPaysContains(String element);
}
