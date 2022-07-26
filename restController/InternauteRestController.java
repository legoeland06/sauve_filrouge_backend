package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Internaute;
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
public class InternauteRestController {

	@Autowired
	private IService<Internaute> internauteService;
	
	// http://localhost:8080/internautes
	@GetMapping("/internautes")
	public ResponseEntity<List<Internaute>> showAll() {
		return new ResponseEntity<List<Internaute>>(internauteService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/internautes/{id}")
	public Optional<Internaute> findById(@PathVariable Long id) {
		return internauteService.findById(id);
	}
	
	@GetMapping("/internautes/{nom}/{prenom}")
	public Optional<List<Internaute>> findByNomAndPrenom(@PathVariable String nom,@PathVariable String prenom) {
		return internauteService.findByNomAndPrenom(nom,prenom);
	}
	
	@PostMapping("/internautes")
	public ResponseEntity<Internaute> save(@RequestBody Internaute i) {
		
		return new ResponseEntity<Internaute>(internauteService.saveOrUpdate(i), HttpStatus.OK);
	}
	
}
