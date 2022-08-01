package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Formation;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin(origins = "*" )//  autorise la communication entre application front-end et back-end
public class FormationRestController {

	@Autowired
	private IService<Formation> formationService;
	
	@PutMapping("/formations/{id}")
	public ResponseEntity<Formation> modify(@PathVariable Long id, @RequestBody Formation target) {

		Formation fm = formationService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Formation not found with id : " + id));
		
		fm.setIntitule(target.getIntitule());
		fm.setDuree(target.getDuree());
		fm.setPrix(target.getPrix());
		fm.setDescriptif(target.getDescriptif());
		
		return new ResponseEntity<Formation>(formationService.saveOrUpdate(fm), HttpStatus.OK);
	}
	
	@GetMapping("/formations")
	public ResponseEntity<List<Formation>> showAll() {
		return new ResponseEntity<List<Formation>>(formationService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/formations/{id}")
	public Optional<Formation> findById(@PathVariable Long id) {
		return formationService.findById(id);
	}
	
	@GetMapping("/formations/findByIntitule/{intitule}")
	public Optional<List<Formation>> findByNom(@PathVariable String intitule) {
		return formationService.findByNomContains(intitule);
	}
	
	@PostMapping("/formations")
	public ResponseEntity<Formation> save(@RequestBody Formation i) {
		
		return new ResponseEntity<Formation>(formationService.saveOrUpdate(i), HttpStatus.OK);
	}
	@DeleteMapping("/formations/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(formationService.deleteById(id), HttpStatus.OK);
	}

}
