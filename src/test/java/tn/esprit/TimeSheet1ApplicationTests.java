package tn.esprit;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.entities.Contrat;
import tn.esprit.entities.Departement;
import tn.esprit.entities.Employe;
import tn.esprit.entities.Entreprise;
import tn.esprit.spring.service.IEntrepriseService;
import tn.esprit.spring.service.UserService;
import tn.esprit.spring.service.IEntrepriseService;
import tn.esprit.spring.service.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeSheet1ApplicationTests {
	@Autowired
	IEmployeService empService ;

	@Autowired
	IEntrepriseService entreservice ;
	
	@Test
	public void contextLoads() {
		//Departement d = new Departement("departement");
		//entreservice.ajouterDepartement(d);
//		Entreprise e = new Entreprise("entr 2","rais 2 ");
//		entreservice.ajouterEntreprise(e);
		//Employe e = new Employe("from","list", "fromlist@gmail.com", true);
		//empService.ajouterEmploye(e);
		//List <Employe> employes = null ;
		//employes.add(e);
		//empService.affecterEmployeADepartement(1, 1);
		
		//Contrat c = new Contrat(01,"contra demi", 750);
		//empService.ajouterContrat(c);
		
		//empService.affecterContratAEmploye(1, 3);
		//empService.getEmployffecterDepartementAEntreprise(int depId, int entrepriseId)ePrenomById(2);
		
		//entreservice.deleteEntreprise(4);
		entreservice.affecterDepartementAEntreprise(1, 5);
		
	}

}
