package tn.esprit.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="entreprise")
public class Entreprise implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;

	private String name ;
	
	private String raisonSocial ;

	
	@OneToMany(mappedBy="entreprise", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<Departement> departement ;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(String name , String raisonSocial) {
	this.name=name;
	this.raisonSocial=raisonSocial ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public List<Departement> getDepartement() {
		return departement;
	}

	public void setDepartement(List<Departement> departement) {
		this.departement = departement;
	}


}
