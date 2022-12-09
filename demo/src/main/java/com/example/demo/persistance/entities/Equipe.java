package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Equipe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private long id;
	@Column(name = "nomequipe")
	private String nomequipe ;
	
	@Column(name = "description")
	private String description ;
	
	
	@JoinColumn(name = "personnel_fk" , referencedColumnName="id")
	@OneToMany(targetEntity=Personnel.class , cascade= CascadeType.ALL)
	private List<Personnel>PersonnelList;


	@JoinColumn(name = "role_fk" , referencedColumnName="id")
	@OneToMany(targetEntity=RoleEquipe.class , cascade= CascadeType.ALL)
	private List<RoleEquipe>RolelList;


	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nomequipe=" + nomequipe + ", description=" + description
				+ ", PersonnelList=" + PersonnelList + ", RolelList=" + RolelList + "]";
	}

	
	
	public Equipe(long id, String nomequipe, String description, List<Personnel> personnelList,
			List<RoleEquipe> rolelList) {
		super();
		this.id = id;
		this.nomequipe = nomequipe;
		this.description = description;
		PersonnelList = personnelList;
		RolelList = rolelList;
	}



	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getIdEquipe() {
		return id;
	}


	public void setIdEquipe(long id) {
		this.id = id;
	}


	public String getNomequipe() {
		return nomequipe;
	}


	public void setNomequipe(String nomequipe) {
		this.nomequipe = nomequipe;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Personnel> getPersonnelList() {
		return PersonnelList;
	}


	public void setPersonnelList(List<Personnel> personnelList) {
		PersonnelList = personnelList;
	}


	public List<RoleEquipe> getRolelList() {
		return RolelList;
	}


	public void setRolelList(List<RoleEquipe> rolelList) {
		RolelList = rolelList;
	}
	
	
}