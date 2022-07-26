package com.example.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="formation")
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "FORMATION_ID_FK")
	private Long id;
	
	private String intitule;
	
	private String descriptif;

	private int duree;
	
	private Date dateDebut;
	
	private double prix;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private Niveau niveau;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private Adresse lieux;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private LienTest lienTest;

	public Formation(String intitule, String descriptif, int duree, Date dateDebut, double prix, Niveau niveau,
			Adresse lieux, LienTest lienTest) {
		super();
		this.intitule = intitule;
		this.descriptif = descriptif;
		this.duree = duree;
		this.dateDebut = dateDebut;
		this.prix = prix;
		this.niveau = niveau;
		this.lieux = lieux;
		this.lienTest = lienTest;
	}

	public Formation() {
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

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Adresse getLieux() {
		return lieux;
	}

	public void setLieux(Adresse lieux) {
		this.lieux = lieux;
	}

	public LienTest getLienTest() {
		return lienTest;
	}

	public void setLienTest(LienTest lienTest) {
		this.lienTest = lienTest;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", intitule=" + intitule + ", descriptif=" + descriptif + ", duree=" + duree
				+ ", dateDebut=" + dateDebut + ", prix=" + prix + ", niveau=" + niveau + ", lieux=" + lieux
				+ ", lienTest=" + lienTest + "]";
	}
	

}
