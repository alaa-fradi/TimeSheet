package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.entities.Contrat;
import tn.esprit.entities.Departement;
import tn.esprit.entities.Employe;

	public interface IEmployeService {
		
		public Employe authenticate(String email, String password) ;
		
	public int ajouterEmploye(Employe employe);
    public void affecterEmployeADepartement(int employeId, int depId);
    public int ajouterContrat(Contrat contrat);
    public void affecterContratAEmploye(int contratId, int employeId);
    public String getEmployePrenomById(int employeId);
    
    public long getNombreEmployeJPQL();
    public List<String> getAllEmployeNamesJPQL();
    public List<Employe> listemploye ();
    public void affecterEmployeDepartement(Employe user, Departement dep);
    public List<Employe> getallEmployebyEntreprise (int identr);
    public Employe getEmploye(String nom, String pwd);
    public void mettreAjourEmailByEmployeId(String email, int employeId);
    
    public int addOrUpdateEmploye(Employe employe);
    
    public List<Employe> getAllEmployes();

    public void deleteEmployeById(int employeId);
}
