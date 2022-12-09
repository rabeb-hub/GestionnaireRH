package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Personnel implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private long id;
	
	@Column(name = "name")
	private String name ;
	
	@Column(name = "prenom")
	private String prenom ;
	
	@Column(name = "email")
	private String email ;
	
	@Column(name = "cin")
	private String cin ;
	
	@Column(name = "adresse")
	private String adresse ;

	@Column(name = "telephone")
	private String telephone ;

	@Column(name = "salaire")
	private String salaire ;
	
	@JoinColumn(name = "conge_fk" , referencedColumnName="id")
	@OneToMany(targetEntity=Conge.class , cascade= CascadeType.ALL)
	private List<Conge>congeList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Personnel [id=" + id + ", name=" + name + ", prenom=" + prenom + ", email=" + email + ", cin=" + cin
				+ ", adresse=" + adresse + ", telephone=" + telephone + ", salaire=" + salaire + ", congeList="
				+ congeList + "]";
	}

	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	public List<Conge> getCongeList() {
		return congeList;
	}

	public void setCongeList(List<Conge> congeList) {
		this.congeList = congeList;
	}

	public Personnel(long id, String name, String prenom, String email, String cin, String adresse, String telephone,
			String salaire, List<Conge> congeList) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.email = email;
		this.cin = cin;
		this.adresse = adresse;
		this.telephone = telephone;
		this.salaire = salaire;
		this.congeList = congeList;
	}
	
	
	
}
