package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="ENTRP")
public class Entreprise extends Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String raisonSociale;
	
	private String contactEntrepriseNom;
	
	private String contactEntreprisePrenom;
	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Email> emails;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Adresse> adresses;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Telephone> telephones;

	public Entreprise() {
		super();
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

	public String getContactEntrepriseNom() {
		return contactEntrepriseNom;
	}

	public void setContactEntrepriseNom(String contactEntrepriseNom) {
		this.contactEntrepriseNom = contactEntrepriseNom;
	}

	public String getContactEntreprisePrenom() {
		return contactEntreprisePrenom;
	}

	public void setContactEntreprisePrenom(String contactEntreprisePrenom) {
		this.contactEntreprisePrenom = contactEntreprisePrenom;
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

	
}
