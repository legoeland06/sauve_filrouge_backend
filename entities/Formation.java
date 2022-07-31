package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.Nullable;

@Entity
@Table(name="formation")
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String intitule;
	
	@Nullable
	private String descriptif;

	private int duree;
	
	private Date dateDebut;
	
	private double prix;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private Niveau niveau;
	
	@Nullable
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private Adresse lieux;
	
	@Nullable
	@Basic(fetch=FetchType.LAZY, optional=true)
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private LienTest lienTest;
	
	@Basic(fetch=FetchType.LAZY, optional=false)
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	private List<Formateur> formateurs;
	
	public Formation(String intitule, String descriptif) {
		super();
		this.intitule = intitule;
		this.descriptif = descriptif;
	}
	
	public Formation(String intitule, String descriptif, int duree, Date dateDebut, double prix, Niveau niveau,
			Adresse lieux, LienTest lienTest,List<Formateur> formateurs) {
		super();
		this.intitule = intitule;
		this.descriptif = descriptif;
		this.duree = duree;
		this.dateDebut = dateDebut;
		this.prix = prix;
		this.niveau = niveau;
		this.lieux = lieux;
		this.lienTest = lienTest;
		this.formateurs = formateurs;
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

	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", intitule=" + intitule + ", descriptif=" + descriptif + ", duree=" + duree
				+ ", dateDebut=" + dateDebut + ", prix=" + prix + ", niveau=" + niveau + ", lieux=" + lieux
				+ ", lienTest=" + lienTest + ", Formateurs= " + formateurs + "]";
	}
	

}
