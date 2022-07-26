package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.NiveauRepository;
import com.example.demo.entities.Niveau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="niveauService")
public class NiveauService implements IService<Niveau> {

	@Autowired
	private NiveauRepository niveauRepository;

	@Override
	public List<Niveau> findAll() {
		return niveauRepository.findAll();
	}

	@Override
	public Niveau saveOrUpdate(Niveau o) {
		// TODO Auto-generated method stub
		return niveauRepository.save(o);
	}

	@Override
	public Optional<Niveau> findById(Long id) {
		// TODO Auto-generated method stub
		return niveauRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		niveauRepository.deleteById(id);
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Optional<List<Niveau>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return niveauRepository.findByIntitule(nom);
	}
 
}
