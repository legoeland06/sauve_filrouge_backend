package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Entreprise;
import com.example.demo.services.IService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" )//  autorise la communication entre application front-end et back-end
public class EntrepriseRestController {

	@Autowired
	private IService<Entreprise> entrepriseService;
	
	// http://localhost:8080/entreprises
	@GetMapping("/entreprises")
	public ResponseEntity<List<Entreprise>> showAll() {
		return new ResponseEntity<List<Entreprise>>(entrepriseService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/entreprises/{id}")
	public Optional<Entreprise> findById(@PathVariable Long id) {
		return entrepriseService.findById(id);
	}
	
	
	@PostMapping("/entreprises")
	public ResponseEntity<Entreprise> save(@RequestBody Entreprise i) {
		
		return new ResponseEntity<Entreprise>(entrepriseService.saveOrUpdate(i), HttpStatus.OK);
	}
	
}
