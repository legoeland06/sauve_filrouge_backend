package com.example.demo.config;


import com.example.demo.dao.InternauteRepository;
import com.example.demo.entities.Internaute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class RunnerConfig implements CommandLineRunner {


	@Autowired
	private InternauteRepository it;
	
	@Override
	public void run(String... args) throws Exception {

		it.save(new Internaute("Strauss-Khan", "Domi-nique", "fjfhg.khf@gdg.com"));
		it.save(new Internaute("Mitterand", "Fredéric", "fjfgfgdfgfdhg.khf@gdg.com"));
		it.save(new Internaute("Epstein", "Jeffrey", "fhg.khf@gdg.com"));
		it.save(new Internaute("Epstein", "Jeffrey", "fjfhg.khfdfd@gdg.com"));
		
	}
}