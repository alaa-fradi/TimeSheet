package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Departement;
import tn.esprit.entities.Entreprise;
import tn.esprit.spring.repository.IDepartementRepository;
import tn.esprit.spring.repository.IEntrepriseRepository;

@Service
public class EntrepriseService implements IEntrepriseService{

	@Autowired
	IEntrepriseRepository entretrp ;
	
	@Autowired
	IDepartementRepository deprep ;
	
	private static final Logger L = LogManager.getLogger(EntrepriseService.class);

	@Override
	public int ajouterEntreprise(Entreprise entreprise) {
		entretrp.save(entreprise);
		return entreprise.getId();
	}
	
	@Override
	public Entreprise modifierEntreprise(Entreprise entreprise) {
		entretrp.save(entreprise);
		return entreprise;
		
	}
	
	@Override
	public int deleteEntreprise(int entrepriseId) {
		Entreprise e = entretrp.findById(entrepriseId).orElse(null);
		entretrp.delete(e);
		return 0;
	}

	@Override
	public Entreprise getEntreprise(int entrepriseId) {
		Entreprise e = entretrp.findById(entrepriseId).orElse(null);
		return e;
	}

	@Override
	public int ajouterDepartement(Departement dep) {
		deprep.save(dep);
		return dep.getId();
	}

	@Override
	public Iterable<Entreprise> getAllEntreprise(){
		
		Iterable<Entreprise> lent = entretrp.findAll();
		
		return lent;
	}
	
	@Override
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
		Entreprise e = entretrp.findById(entrepriseId).orElse(null);
		Departement d = deprep.findById(depId).orElse(null);
		d.setEntreprise(e);
		deprep.save(d);
	}

	@Override
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		Entreprise e = entretrp.findById(entrepriseId).orElse(null);
		List<Departement> ldep = e.getDepartement();
		List<String> lnoms= new ArrayList<String>();
		
		for(Departement dep:ldep) {
			lnoms.add(dep.getName());
		}
		return null;
	}

	@Override
	public void deleteEntrepriseetDepartement(int ide) {
		Entreprise e = entretrp.findById(ide).orElse(null);
		entretrp.delete(e);
	}

	@Override
	public void ajouterEtAffecterEntrepriseDepartement(Departement dep, Entreprise ent) {
		dep.setEntreprise(ent);
		deprep.save(dep);
		
	}
	
}
