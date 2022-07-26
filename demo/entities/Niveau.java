package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="niveau")
public class Niveau {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "NIVEAU_ID_FK")
	private Long id;
	
	private String intitule;

	
	public Niveau() {
		super();
	}

	public Niveau(String intitule) {
		super();
		this.intitule = intitule;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@Override
	public String toString() {
		return "Niveau [id=" + id + ", intitule=" + intitule + "]";
	}
	
}
