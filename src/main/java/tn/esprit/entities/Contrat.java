package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Contrat implements Serializable{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reference ;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut ;
	
	private String typeContrat ;
	
	@OneToOne(mappedBy="contrat")
	private Employe employe;
	
	private int salaire;

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	
	public Contrat(int reference,  String typeContrat, int salaire) {
		super();
		this.reference = reference;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	
}
