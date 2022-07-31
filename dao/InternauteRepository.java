package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Commande;
import com.example.demo.entities.Internaute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternauteRepository  extends JpaRepository<Internaute, Long>{

	List<Internaute> findByNomContains(String element);

	
}
