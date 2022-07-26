package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="internaute")
public class Internaute {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "INTERNAUTE_ID_FK")
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String password;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private Niveau niveau;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Adresse> adresses;
	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Telephone> telephones;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
    private Entreprise entreprise;

	public Internaute() {
		super();
	}
	
	public Internaute(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		
	}

	public Internaute( String nom, String prenom, String email, String password, Niveau niveau,
			List<Adresse> adresses, List<Telephone> telephones, Entreprise entreprise) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.niveau = niveau;
		this.adresses = adresses;
		this.telephones = telephones;
		this.entreprise = entreprise;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		return "Internaute [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
				+ password + ", niveau=" + niveau + ", adresses=" + adresses + ", telephones=" + telephones
				+ ", entreprise=" + entreprise + "]";
	}

	
}
