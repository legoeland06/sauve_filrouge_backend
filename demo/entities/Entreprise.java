package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="entreprise")
public class Entreprise {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ENTREPRISE_ID_FK")
	private Long id;

	private String raisonSociale;
	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Email> emails; // est ce que String est une entite @Entity ?

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Adresse> adresses;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Telephone> telephones;

	public Entreprise() {
		super();
	}

	public Entreprise(String raisonSociale, List<Email> emails, List<Adresse> adresses, List<Telephone> telephones) {
		super();
		this.raisonSociale = raisonSociale;
		this.emails = emails;
		this.adresses = adresses;
		this.telephones = telephones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
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
		return "Entreprise [raisonSociale=" + raisonSociale + ", emails=" + emails + ", adresses=" + adresses
				+ ", telephones=" + telephones + "]";
	}

	
}
