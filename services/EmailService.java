package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.EmailRepository;
import com.example.demo.entities.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="emailService")
public class EmailService implements IService<Email> {

	@Autowired
	private EmailRepository emailRepository;

	@Override
	public List<Email> findAll() {
		return emailRepository.findAll();
	}

	@Override
	public Email saveOrUpdate(Email o) {
		// TODO Auto-generated method stub
		return emailRepository.save(o);
	}

	@Override
	public Optional<Email> findById(Long id) {
		// TODO Auto-generated method stub
		return emailRepository.findById(id);
	}

	@Override
	public Long delete(Long id) {
		emailRepository.deleteById(id);
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Optional<List<Email>> findByNom(String nom) {
		// TODO Auto-generated method stub
		return emailRepository.findByEmail(nom);
	}
 
}
