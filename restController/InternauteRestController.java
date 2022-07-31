package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import com.example.demo.entities.Internaute;
import com.example.demo.services.IService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ch.qos.logback.core.status.Status;

@RestController
@CrossOrigin(origins = "*" )//  autorise la communication entre application front-end et back-end
public class InternauteRestController {

	@Autowired
	private IService<Internaute> internauteService;
	
	@PutMapping("/internautes/{id}")
	public ResponseEntity<Internaute> modify(@PathVariable Long id, @RequestBody Internaute target) {

		Internaute it = internauteService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Internaute not found with id : " + id));
		
		it.setNom(target.getNom());
		it.setPrenom(target.getPrenom());
		it.setEmail(target.getEmail());
		it.setPassword(target.getPassword());
		
		return new ResponseEntity<Internaute>(internauteService.saveOrUpdate(it), HttpStatus.OK);
	}
	
	// http://localhost:8080/internautes
	@GetMapping("/internautes")
	public ResponseEntity<List<Internaute>> showAll() {
		return new ResponseEntity<List<Internaute>>(internauteService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/internautes/{id}")
	public Optional<Internaute> findById(@PathVariable Long id) {
		return internauteService.findById(id);
	}
	
	@GetMapping("/internautes/findByNom/{nom}")
	public Optional<List<Internaute>> findByNom(@PathVariable String nom) {
		return Optional.of(internauteService.findByNomContains(nom));
	}
	
	@PostMapping("/internautes")
	public ResponseEntity<Internaute> save(@RequestBody Internaute i) {
		
		return new ResponseEntity<Internaute>(internauteService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/internautes/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(internauteService.deleteById(id), HttpStatus.OK);
	}
}
