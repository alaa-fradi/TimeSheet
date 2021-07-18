package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Contrat;
import tn.esprit.entities.Departement;
import tn.esprit.entities.Employe;
import tn.esprit.entities.Entreprise;
import tn.esprit.spring.repository.IContratRepository;
import tn.esprit.spring.repository.IDepartementRepository;
import tn.esprit.spring.repository.IEmployeRepository;
import tn.esprit.spring.repository.IEntrepriseRepository;

@Service
public class EmployeService implements IEmployeService {

	@Autowired
	IEmployeRepository emprep ;
	
	@Autowired
	IDepartementRepository deprep ;
	
	@Autowired
	IContratRepository contrep ;
	
	@Autowired
	IEntrepriseRepository entrep ;

	@Override
	public int ajouterEmploye(Employe employe) {
		
		emprep.save(employe);
		return 0;
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void affecterEmployeADepartement(int employeId, int depId) {
		Employe e = emprep.findById(employeId).orElse(null);
		Departement d = deprep.findById(depId).orElse(null);
		
		//e.setDepartement((List<Departement>)d);
		//emprep.save(e);
		e.getDepartement();
		emprep.save(e);
		
	}

	@Override
	public int ajouterContrat(Contrat contrat) {
		contrep.save(contrat);
		return 0;
	}

	@Override
	public void affecterContratAEmploye(int contratId, int employeId) {
		Employe e = emprep.findById(employeId).orElse(null);
		Contrat c = contrep.findById(contratId).orElse(null);
		e.setContrat(c);
		emprep.save(e);
	}

	@Override
	public String getEmployePrenomById(int employeId) {
		Employe e = emprep.findById(employeId).orElse(null);
		return e.getPrenom();
	}

	@Override
	public long getNombreEmployeJPQL() {
		return emprep.count();
	}

	//@Override
	//public List<String> getAllEmployeNamesJPQL() {
		//return emprep.employesNom();
	
	//}

	@Override
	public List<Employe> listemploye() {
		ArrayList<Employe> empList =new ArrayList<Employe>();
		emprep.findAll().forEach(e->empList.add(e));
		return empList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void affecterEmployeDepartement(Employe user, Departement dep) {
		user.setDepartement((List<Departement>)dep);
		emprep.save(user);
		
	}

	@Override
	public List<Employe> getallEmployebyEntreprise(int identr) {
		Entreprise e = entrep.findById(identr).orElse(null);

		List<Departement> ldep = e.getDepartement();
		
		List<Employe> lEmp = new ArrayList<Employe>();
		
		for(Departement dep:ldep) {
			lEmp.add((Employe)dep.getEmployes());
		}
		return null;
	}

	@Override
	public Employe getEmploye(String nom, String prenom) {
		
		List<Employe> Allemp =listemploye() ;
		List<Employe> lemp = new ArrayList<Employe>();
		
		for(Employe emp:Allemp) {
			if(emp.getNom()==nom && emp.getPrenom()==prenom)
				lemp.add(emp);
		}
		return null;
	}

	@Override
	public void mettreAjourEmailByEmployeId(String email, int employeId) {
		Employe e = emprep.findById(employeId).orElse(null);
		e.setEmail(email);
		emprep.save(e);
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Employe authenticate(String email, String password) {

		return emprep.getEmployeByEmailAndPassword(email,password);
		
	}
	
	@Override
	public int addOrUpdateEmploye(Employe employe) {
		emprep.save(employe);
	return employe.getId();
	}

	@Override
	public List<Employe> getAllEmployes() {
	return (List<Employe>) emprep.findAll();
	}
	
	@Override
	public void deleteEmployeById(int employeId) {
		Employe e = emprep.findById(employeId).orElse(null);
		emprep.delete(e);
	}
	
}
