package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "CATEGORIE_ID_FK")
	private Long id;

	private String intitule;

	@ManyToMany
	private List<Categorie> mere = new ArrayList<>();

	@ManyToMany(mappedBy = "mere")
	private List<Categorie> fille = new ArrayList<>();

	public Categorie(String intitule, List<Categorie> mere, List<Categorie> fille) {
		super();
		this.intitule = intitule;
		this.mere = mere;
		this.fille = fille;
	}

	public Categorie() {
		super();
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

	public List<Categorie> getMere() {
		return mere;
	}

	public void setMere(List<Categorie> mere) {
		this.mere = mere;
	}

	public List<Categorie> getFille() {
		return fille;
	}

	public void setFille(List<Categorie> fille) {
		this.fille = fille;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", intitule=" + intitule + ", mere=" + mere + ", fille=" + fille + "]";
	}

}
