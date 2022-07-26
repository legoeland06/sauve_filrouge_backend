package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.FormateurRepository;
import com.example.demo.entities.Formateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="formateurService")
public class FormateurService implements IService<Formateur> {

	@Autowired
	private FormateurRepository formateurRepository;

	@Override
	public List<Formateur> findAll() {
		return formateurRepository.findAll();
	}

	@Override
	public Formateur saveOrUpdate(Formateur o) {
		return formateurRepository.save(o);
	}

	@Override
	public Optional<Formateur> findById(Long id) {
		// TODO Auto-generated method stub
		return formateurRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		formateurRepository.deleteById(id);
		return id;
	}

	@Override
	public Optional<List<Formateur>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return formateurRepository.findByNom(nom);
	}

	
}
