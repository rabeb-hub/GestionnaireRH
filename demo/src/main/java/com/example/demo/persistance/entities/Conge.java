package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Conge implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCong", unique = true)
	private long idCong;
	
	@Column(name = "datedeb")
	String datedeb;
	
	@Column(name = "duree")
	String duree;
    
	@Column(name = "nbrjourt")
	String  nbrjourt ;
	
	
	@Column(name = "nbrjourr")
	String  nbrjourr ;
	

	public long getIdCong() {
		return idCong;
	}

	public void setIdCong(long idCong) {
		this.idCong = idCong;
	}

	public Conge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conge(long idCong, String datedeb, String duree, String nbrjourt, String nbrjourr) {
		super();
		this.idCong = idCong;
		this.datedeb = datedeb;
		this.duree = duree;
		this.nbrjourt = nbrjourt;
		this.nbrjourr = nbrjourr;
	}

	public String getDatedeb() {
		return datedeb;
	}

	public void setDatedeb(String datedeb) {
		this.datedeb = datedeb;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getNbrjourt() {
		return nbrjourt;
	}

	public void setNbrjourt(String nbrjourt) {
		this.nbrjourt = nbrjourt;
	}

	public String getNbrjourr() {
		return nbrjourr;
	}

	public void setNbrjourr(String nbrjourr) {
		this.nbrjourr = nbrjourr;
	}

	
	
}