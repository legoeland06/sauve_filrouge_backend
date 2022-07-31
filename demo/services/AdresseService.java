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
	private AdresseRepository adrRepository;

	@Override
	public List<Adresse> findAll() {
		// TODO Auto-generated method stub
		return adrRepository.findAll();
	}

	@Override
	public Adresse saveOrUpdate(Adresse o) {
		// TODO Auto-generated method stub
		Adresse changedAdr = new Adresse();
		changedAdr.setRue(o.getRue());
		changedAdr.setCp(o.getCp());
		changedAdr.setVille(o.getVille());
		changedAdr.setPays(o.getPays());
		
		return adrRepository.save(changedAdr);
	}

	@Override
	public Optional<Adresse> findById(Long id) {
		// TODO Auto-generated method stub
		return adrRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		adrRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Adresse o) {
		// TODO Auto-generated method stub
		adrRepository.delete(o);
	}

	@Override
	public List<Adresse> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return adrRepository.findByVilleContains(element);
	}

 
}
