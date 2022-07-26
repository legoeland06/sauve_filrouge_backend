package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Commande;
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
public class CommandeRestController {

	@Autowired
	private IService<Commande> commandeService;
	
	// http://localhost:8080/commandes
	@GetMapping("/commandes")
	public ResponseEntity<List<Commande>> showAll() {
		return new ResponseEntity<List<Commande>>(commandeService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/commandes/{id}")
	public Optional<Commande> findById(@PathVariable Long id) {
		return commandeService.findById(id);
	}
	
	@PostMapping("/commandes")
	public ResponseEntity<Commande> save(@RequestBody Commande i) {
		
		return new ResponseEntity<Commande>(commandeService.saveOrUpdate(i), HttpStatus.OK);
	}
	
}
