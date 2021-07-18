package tn.esprit.spring.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import tn.esprit.entities.Employe;
import tn.esprit.entities.Role;
import tn.esprit.spring.service.IEmployeService;

@Scope(value = "session")
@Controller(value = "employeController") // Name of the bean in Spring IoC
@ELBeanName(value = "employeController") // Name of the bean used by JSF
@Join(path = "/", to = "/login.jsf")
public class ControllerEmployeImpl {
	@Autowired
	IEmployeService empService;
	
	private String login;
	private String password ;
	private Employe employe ;
	private Boolean loggedIn ;
	
	private Employe authenticatedUser;
	
	private String prenom; private String nom ; private String email;
	private boolean actif; private Role role;
	
	private Integer employeIdToBeUpdated;
	
	public Role[] getRoles() { return Role.values(); }
	
	private List<Employe> employes;
	
	public String doLogin() {
		String navigateTo = "null";
		authenticatedUser=empService.authenticate(login, password);
		if (authenticatedUser != null && authenticatedUser.getRole() ==
		Role.ADMINISTRATEUR) {
		navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";
		loggedIn = true; }
		else {
		FacesMessage facesMessage =new FacesMessage("Login Failed: please check your username/password and try again.");
		FacesContext.getCurrentInstance().addMessage("form:btn",facesMessage);
		}
		return navigateTo;
		}

	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login.xhtml?faces-redirect=true";
		}
	
	public void addEmploye() {
		empService.addOrUpdateEmploye(new Employe(nom, prenom, email, password, actif, role));
		}
	
	public List<Employe> getEmployes() {
		employes = empService.getAllEmployes();
		return employes;
		}
	
	public void removeEmploye(int employeId)
	{
		empService.deleteEmployeById(employeId);
	}
	
	public void displayEmploye(Employe empl)
	{
	this.setPrenom(empl.getPrenom());
	this.setNom(empl.getNom());
	this.setActif(empl.isActif());
	this.setEmail(empl.getEmail());
	this.setRole(empl.getRole());
	this.setPassword(empl.getPassword());
	}
	
	public void updateEmploye()
	{ empService.addOrUpdateEmploye(new Employe(employeIdToBeUpdated, nom,
	prenom, email, password, actif, role)); }
	
	
	

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

		public Employe getEmploye() {
			return employe;
		}

		public void setEmploye(Employe employe) {
			this.employe = employe;
		}

		public Boolean getLoggedIn() {
			return loggedIn;
		}

		public void setLoggedIn(Boolean loggedIn) {
			this.loggedIn = loggedIn;
		}
		
		public Employe getAuthenticatedUser() {
			return authenticatedUser;
		}

		public void setAuthenticatedUser(Employe authenticatedUser) {
			this.authenticatedUser = authenticatedUser;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
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

}
