package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@DiscriminatorValue(value="INTERNAUTE")
public class Internaute extends Client{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private Email email;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	@JoinColumn(name="niveau")
	private Niveau niveau;

	@Nullable
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Adresse> adresses;
	
	@Nullable
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Telephone> telephones;
	
	public Internaute() {
		super();
	}
	
	public Internaute(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;		
	}

	public Internaute( String nom, String prenom, Email email,Niveau niveau,
			List<Adresse> adresses, List<Telephone> telephones) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.niveau = niveau;
		this.adresses = adresses;
		this.telephones = telephones;
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

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	@Override
	public String toString() {
		return "Internaute [id=" + id +  ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", niveau=" + niveau + ", adresses=" + adresses + ", telephones=" + telephones
				+ "]";
	}

	
}
