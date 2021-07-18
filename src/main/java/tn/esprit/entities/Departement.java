package tn.esprit.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Departement implements Serializable{
	//Il faut mettre les noms des table majuscule
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String name ;
	//Les noms des objets aussi en minuscule
	@ManyToMany(mappedBy="departement")
	private List<Employe> employes ;
	
	@ManyToOne(cascade= CascadeType.PERSIST)
	private Entreprise entreprise ;
	
	@OneToMany(mappedBy="departement")
	private List<Mission> mission ;
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Departement(String name ) {
		this.name=name ;
	}


	public List<Mission> getMission() {
		return mission;
	}

	public void setMission(List<Mission> mission) {
		this.mission = mission;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	

}
