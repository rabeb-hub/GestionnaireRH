package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Tache implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTache;
	
	@Column(name = "nomtache")
	String nomtache ;
	
	@Column(name = "descriptiontache")
	String descriptiontache ;
	
	@Column(name = "statut")
	String statut ;
	
	@JoinColumn(name = "equipe_fk" , referencedColumnName="idTache")
	@OneToMany(targetEntity=Equipe.class , cascade= CascadeType.ALL)
	private List<Equipe>equipeList;

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", nomtache=" + nomtache + ", descriptiontache=" + descriptiontache
				+ ", statut=" + statut + ", equipeList=" + equipeList + "]";
	}

	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tache(long idTache, String nomtache, String descriptiontache, String statut, List<Equipe> equipeList) {
		super();
		this.idTache = idTache;
		this.nomtache = nomtache;
		this.descriptiontache = descriptiontache;
		this.statut = statut;
		this.equipeList = equipeList;
	}

	public long getIdTache() {
		return idTache;
	}

	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}

	public String getNomtache() {
		return nomtache;
	}

	public void setNomtache(String nomtache) {
		this.nomtache = nomtache;
	}

	public String getDescriptiontache() {
		return descriptiontache;
	}

	public void setDescriptiontache(String descriptiontache) {
		this.descriptiontache = descriptiontache;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public List<Equipe> getEquipeList() {
		return equipeList;
	}

	public void setEquipeList(List<Equipe> equipeList) {
		this.equipeList = equipeList;
	}
	
	
}