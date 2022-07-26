package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Entreprise;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Internaute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository  extends JpaRepository<Categorie, Long>{

	List<Categorie> findAll();
	Optional<Categorie> findById(Long id);
	Optional<List<Categorie>> findByIntitule(String intitule);
	
}
