package tn.esprit.spring.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Employe;

@Repository
public interface IEmployeRepository extends CrudRepository<Employe, Integer>{

	Employe getEmployeByEmailAndPassword(String email, String password);
	
	//@Query("SELECT prenom FROM employe")
	//public List<String> employesNom();

}
