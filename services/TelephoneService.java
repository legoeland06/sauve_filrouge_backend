package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.TelephoneRepository;
import com.example.demo.entities.Telephone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="telephoneService")
public class TelephoneService implements IService<Telephone> {

	@Autowired
	private TelephoneRepository telephoneRepository;

	@Override
	public List<Telephone> findAll() {
		return telephoneRepository.findAll();
	}

	@Override
	public Telephone saveOrUpdate(Telephone o) {
		// TODO Auto-generated method stub
		return telephoneRepository.save(o);
	}

	@Override
	public Optional<Telephone> findById(Long id) {
		// TODO Auto-generated method stub
		return telephoneRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		telephoneRepository.deleteById(id);
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Optional<List<Telephone>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

 
}
