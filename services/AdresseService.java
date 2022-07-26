package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.AdresseRepository;
import com.example.demo.entities.Adresse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="adresseService")
public class AdresseService implements IService<Adresse> {

	@Autowired
	private AdresseRepository adresseRepository;

	@Override
	public List<Adresse> findAll() {
		return adresseRepository.findAll();
	}

	@Override
	public Adresse saveOrUpdate(Adresse o) {
		// TODO Auto-generated method stub
		return adresseRepository.save(o);
	}

	@Override
	public Optional<Adresse> findById(Long id) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		adresseRepository.deleteById(id);
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Optional<List<Adresse>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
 
}
