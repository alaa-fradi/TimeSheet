package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Entreprise;

@Repository
public interface IEntrepriseRepository extends CrudRepository<Entreprise,Integer> {

}
