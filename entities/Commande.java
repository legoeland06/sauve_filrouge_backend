package com.example.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "id_Sequence", sequenceName = "COMMANDE_ID_FK")
	private Long id;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.ALL })
	@JoinColumn(name = "internaute_id", referencedColumnName = "id", nullable = true)
	private Internaute internaute;

	private Date dateValidation;

	private double solde;

	public Commande() {
		super();
	}

	public Commande(Internaute internaute, Date dateValidation, double solde) {
		super();
		this.internaute = internaute;
		this.dateValidation = dateValidation;
		this.solde = solde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Internaute getInternaute() {
		return internaute;
	}

	public void setInternaute(Internaute internaute) {
		this.internaute = internaute;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", internaute=" + internaute + ", dateValidation=" + dateValidation + ", solde="
				+ solde + "]";
	}

}
