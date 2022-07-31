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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String intitule;

	@ManyToMany
	private List<Categorie> meres = new ArrayList<>();

	@ManyToMany(mappedBy = "meres")
	private List<Categorie> filles = new ArrayList<>();

	public Categorie(String intitule) {
		super();
		this.intitule=intitule;
	}
	public Categorie(String intitule, List<Categorie> meres, List<Categorie> filles) {
		super();
		this.intitule = intitule;
		this.meres = meres;
		this.filles = filles;
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

	public List<Categorie> getMeres() {
		return meres;
	}

	public void setMere(List<Categorie> meres) {
		this.meres = meres;
	}

	public List<Categorie> getFilles() {
		return filles;
	}

	public void setFille(List<Categorie> filles) {
		this.filles = filles;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", intitule=" + intitule + ", mere=" + meres + ", fille=" + filles + "]";
	}

}
