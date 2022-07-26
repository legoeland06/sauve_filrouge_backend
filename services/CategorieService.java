package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.CommandeRepository;
import com.example.demo.entities.Categorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="categorieService")
public class CategorieService implements IService<Categorie> {

	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie saveOrUpdate(Categorie o) {
		// TODO Auto-generated method stub
		return categorieRepository.save(o);
	}

	@Override
	public Optional<Categorie> findById(Long id) {
		// TODO Auto-generated method stub
		return categorieRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		categorieRepository.deleteById(id);
		// TODO Auto-generated method stub
		return id;
	}

	public Optional<List<Categorie>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return categorieRepository.findByIntitule(nom);
	}
 
	
}
