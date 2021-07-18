package tn.esprit.spring.service;

import tn.esprit.entities.User;

public interface UserService {
	
	public void addUser(User u);
	
	public void deleteUser(User u) ;

	public void updateUser(User u);
	
	public void retrieveUser(User u);

	public void retrieveAllUsers();
	
}
