package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.LienTest;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LienTestRepository  extends JpaRepository<LienTest, Long>{

	List<LienTest> findAll();
	Optional<LienTest> findById(Long id);
	Optional<List<LienTest>> findByLien(String lien);
	
}
