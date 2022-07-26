package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.CommandeRepository;
import com.example.demo.entities.Commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="commandeService")
public class CommandeService implements IService<Commande> {

	@Autowired
	private CommandeRepository commandeRepository;

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return commandeRepository.findAll();
	}

	@Override
	public Commande saveOrUpdate(Commande o) {
		// TODO Auto-generated method stub
		return commandeRepository.save(o);
	}

	@Override
	public Optional<Commande> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Commande>> findByNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


}
