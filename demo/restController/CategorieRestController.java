package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Categorie;
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
public class CategorieRestController {

	@Autowired
	private IService<Categorie> categorieService;
	
	@PutMapping("/categories/{id}")
	public ResponseEntity<Categorie> modify(@PathVariable Long id, @RequestBody Categorie target) {

		Categorie cat = categorieService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Categorie not found with id : " + id));
		
		cat.setIntitule(target.getIntitule());
		
		return new ResponseEntity<Categorie>(categorieService.saveOrUpdate(cat), HttpStatus.OK);
	}
	
	// http://localhost:8080/categories
	@GetMapping("/categories")
	public ResponseEntity<List<Categorie>> showAll() {
		return new ResponseEntity<List<Categorie>>(categorieService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/categories/{id}")
	public Optional<Categorie> findById(@PathVariable Long id) {
		return categorieService.findById(id);
	}
	
	
	
	@PostMapping("/categories")
	public ResponseEntity<Categorie> save(@RequestBody Categorie i) {
		
		return new ResponseEntity<Categorie>(categorieService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(categorieService.deleteById(id), HttpStatus.OK);
	}

	
}
