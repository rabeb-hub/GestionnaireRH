package com.example.demo.persistance.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class RoleEquipe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRole", unique = true)
	private long idRole;
	
	@Column(name = "nomrole")
	private String nomrole ;
	
	@Column(name = "description")
	private String description ;

	public RoleEquipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleEquipe(long idRole, String nomrole, String description) {
		super();
		this.idRole = idRole;
		this.nomrole = nomrole;
		this.description = description;
	}

	@Override
	public String toString() {
		return "RoleEquipe [idRole=" + idRole + ", nomrole=" + nomrole + ", description=" + description + "]";
	}

	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getNomrole() {
		return nomrole;
	}

	public void setNomrole(String nomrole) {
		this.nomrole = nomrole;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
