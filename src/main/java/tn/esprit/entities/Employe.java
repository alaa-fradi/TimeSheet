package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Employe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String prenom ;
	private String nom ;
	private String email;
	
	
	private String password ;
	
	
	private boolean actif;
	@Enumerated(EnumType.STRING)
	private Role role ;
	
	@ManyToMany
	private List<Mission> mission ;
	
	@ManyToMany
	private List<Departement> departement ;
	
	@OneToOne 
	private Contrat contrat ;
	
	public Employe(String nom, String prenom,  String email, Boolean actif) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.actif = actif;
	}

	
	public Contrat getContrat() {
		return contrat;
	}
	public Employe(String nom, String prenom, String email, String password, boolean actif, Role role ) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.actif = actif;
		this.role = role; 
	}


	public Employe(int id,String nom,  String prenom, String email, String password, boolean actif, Role role) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.actif = actif;
		this.role = role;
	}


	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public List<Departement> getDepartement() {
		return departement;
	}
	public void setDepartement(List<Departement> departement) {
		this.departement = departement;
	}
	public List<Mission> getMission() {
		return mission;
	}
	public void setMission(List<Mission> mission) {
		this.mission = mission;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}


	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
