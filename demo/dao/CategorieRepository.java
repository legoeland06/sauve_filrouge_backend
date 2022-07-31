package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository  extends JpaRepository<Categorie, Long>{

	List<Categorie> findByIntituleContains(String element);
}
