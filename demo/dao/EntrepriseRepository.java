package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Entreprise;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Internaute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository  extends JpaRepository<Entreprise, Long>{

	List<Entreprise> findAll();
	Optional<List<Entreprise>> findByRaisonSociale(String rs);
}
