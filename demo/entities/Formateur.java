package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "formateur")
public class Formateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nom;

	private String prenom;

	@OneToOne
	private Email email;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Telephone> telephones;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Categorie> categories;

	public Formateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Formateur(String nom, String prenom, Email email, List<Telephone> telephones,List<Categorie> categories) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephones = telephones;
		this.categories = categories;
	}

	public Formateur() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telephone> getTelephone() {
		return telephones;
	}

	public void setTelephone(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Formateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", telephone="
				+ telephones + ", Catégories "+ categories +"]";
	}

}
