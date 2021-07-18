package tn.esprit.entities;

import java.io.Serializable;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="mission")
public class Mission implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String name ;
	private String description ;
	
	@ManyToMany(mappedBy="mission")
	private List<Employe> employes ;
	
	@ManyToOne
	private Departement departement ;
	
	
	
	
	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public List<Employe> getEmployes() {
		return employes;
	}


	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
