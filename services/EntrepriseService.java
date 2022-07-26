package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.entities.Entreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service(value="entrepriseService")
public class EntrepriseService implements IService<Entreprise> {

	@Autowired
	private EntrepriseRepository entrepriseRepository;

	public Optional<List<Entreprise>> findByIntitule(@RequestParam String i){
		return entrepriseRepository.findByRaisonSociale(i);
	}
	@Override
	public List<Entreprise> findAll() {
		return entrepriseRepository.findAll();
	}

	@Override
	public Entreprise saveOrUpdate(Entreprise o) {
		return entrepriseRepository.save(o);
	}

	@Override
	public Optional<Entreprise> findById(Long id) {
		// TODO Auto-generated method stub
		return entrepriseRepository.findById(id);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Entreprise>> findByNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	

}
