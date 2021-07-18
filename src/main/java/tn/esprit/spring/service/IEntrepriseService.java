package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.entities.Departement;
import tn.esprit.entities.Entreprise;

public interface IEntrepriseService {

	public int ajouterEntreprise(Entreprise entreprise);
	
	public int deleteEntreprise(int entrepriseId);
	
	public Entreprise modifierEntreprise(Entreprise entreprise);
	
	public Entreprise getEntreprise(int entrepriseId);

	public Iterable<Entreprise> getAllEntreprise();
	
	public int ajouterDepartement(Departement dep);
	void affecterDepartementAEntreprise(int depId , int entrepriseId);
	List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) ;
	
	public void deleteEntrepriseetDepartement(int ide) ;
	public void ajouterEtAffecterEntrepriseDepartement(Departement dep, Entreprise ent) ;
	
}
