package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.InternauteRepository;
import com.example.demo.entities.Internaute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="internauteService")
public class InternauteService implements IService<Internaute> {

	@Autowired
	private InternauteRepository internauteRepository;
	
	
	@Override
	public List<Internaute> findAll() {
		// TODO Auto-generated method stub
		return internauteRepository.findAll();
	}

	@Override
	public Internaute saveOrUpdate(Internaute o) {
		// TODO Auto-generated method stub
		return internauteRepository.save(o);
	}

	@Override
	public Optional<Internaute> findById(Long id) {
		// TODO Auto-generated method stub
		return internauteRepository.findById(id);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Internaute>> findByNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return internauteRepository.findByNomAndPrenom(nom, prenom);
	}

}
