package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Formation;
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
public class FormationRestController {

	@Autowired
	private IService<Formation> formationService;
	
	// http://localhost:8080/formations
	@GetMapping("/formations")
	public ResponseEntity<List<Formation>> showAll() {
		return new ResponseEntity<List<Formation>>(formationService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/formations/{id}")
	public Optional<Formation> findById(@PathVariable Long id) {
		return formationService.findById(id);
	}
	
	
	@PostMapping("/formations")
	public ResponseEntity<Formation> save(@RequestBody Formation i) {
		
		return new ResponseEntity<Formation>(formationService.saveOrUpdate(i), HttpStatus.OK);
	}
	
}
