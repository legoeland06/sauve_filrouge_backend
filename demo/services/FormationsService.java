package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.FormationRepository;
import com.example.demo.entities.Formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service(value="formationService")
public class FormationsService implements IService<Formation> {

	@Autowired
	private FormationRepository formationRepository;

	public Optional<List<Formation>> findByIntitule(@RequestParam String i){
		return formationRepository.findByIntitule(i);
	}
	@Override
	public List<Formation> findAll() {
		return formationRepository.findAll();
	}

	@Override
	public Formation saveOrUpdate(Formation o) {
		return formationRepository.save(o);
	}

	@Override
	public Optional<Formation> findById(Long id) {
		// TODO Auto-generated method stub
		return formationRepository.findById(id);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Formation>> findByNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	

}
