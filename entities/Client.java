package com.example.demo.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CLIENT")
@DiscriminatorValue(value = "CLIENT")
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String password;

	// Le client crée la commande
	@OneToOne
	private Commande currentCommande;
	
	@Basic(fetch=FetchType.LAZY)
	@OneToMany
	private List<Commande> historyOfCommands;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Commande getCurrentCommande() {
		return currentCommande;
	}

	public void setCurrentCommande(Commande currentCommande) {
		this.currentCommande = currentCommande;
	}

	public List<Commande> getHistoryOfCommands() {
		return historyOfCommands;
	}

	public void setHistoryOfCommands(List<Commande> historyOfCommands) {
		this.historyOfCommands = historyOfCommands;
	}

	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", password=" + password + ", currentCommande=" + currentCommande
				+ ", historyOfCommands=" + historyOfCommands + "]";
	}
	
}
