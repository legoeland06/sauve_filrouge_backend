package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.LienTestRepository;
import com.example.demo.entities.LienTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="lienTestService")
public class LienService implements IService<LienTest> {

	@Autowired
	private LienTestRepository lienTestRepository;

	@Override
	public List<LienTest> findAll() {
		return lienTestRepository.findAll();
	}

	@Override
	public LienTest saveOrUpdate(LienTest o) {
		// TODO Auto-generated method stub
		return lienTestRepository.save(o);
	}

	@Override
	public Optional<LienTest> findById(Long id) {
		// TODO Auto-generated method stub
		return lienTestRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		lienTestRepository.deleteById(id);
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Optional<List<LienTest>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return lienTestRepository.findByLien(nom);
	}
 
}
