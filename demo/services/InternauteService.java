package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.InternauteRepository;
import com.example.demo.entities.Internaute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "internauteService")
public class InternauteService implements IService<Internaute> {

	@Autowired
	private InternauteRepository itRepository;

	@Override
	public List<Internaute> findAll() {
		// TODO Auto-generated method stub
		return itRepository.findAll();
	}

	@Override
	public Internaute saveOrUpdate(Internaute o) {
		// TODO Auto-generated method stub
		Internaute changedInternaute = new Internaute();
		
		changedInternaute.setNom(o.getNom());
		changedInternaute.setPrenom(o.getPrenom());
		changedInternaute.setEmail(o.getEmail());
		changedInternaute.setPassword(o.getPassword());
		
		return itRepository.save(changedInternaute);
	}

	@Override
	public Optional<Internaute> findById(Long id) {
		// TODO Auto-generated method stub
		return itRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		itRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Internaute o) {
		// TODO Auto-generated method stub
		itRepository.delete(o);
	}

	@Override
	public List<Internaute> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return itRepository.findByNomContains(element);
	}

	
}
