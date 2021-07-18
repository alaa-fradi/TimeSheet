package tn.esprit.spring.control;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Entreprise;
import tn.esprit.spring.service.IEntrepriseService;

@RestController
public class EntrepriseRestControlImpl {
	
	@Autowired
	IEntrepriseService entrepService ;
	
	@GetMapping("/getEntreprise/{Entreprise-id}")
	@ResponseBody
	public Entreprise getEntreprise(@PathVariable("Entreprise-id") int entrepriseId) {
	return entrepService.getEntreprise(entrepriseId);
	} 
	
	@PostMapping("/addEntreprise")
	@ResponseBody
	public Entreprise addEntreprise(@RequestBody Entreprise e){
		entrepService.ajouterEntreprise(e);
		return e ;
	}

	@PutMapping("/modify-Entreprise")
	@ResponseBody
	public Entreprise modifierEntreprise(@RequestBody Entreprise e) {
	return entrepService.modifierEntreprise(e);
	}
	
	@DeleteMapping("/deleteEntreprise/{Entreprise-id}")
	@ResponseBody
	public void deleteEntreprise(@PathVariable("Entreprise-id") int entrepriseId){
		entrepService.deleteEntreprise(entrepriseId);
	}
	
	@GetMapping("/getAllEntreprise")
	@ResponseBody
	public Iterable<Entreprise> getAllEntreprise() {
	return entrepService.getAllEntreprise();
	}
	
	

}
