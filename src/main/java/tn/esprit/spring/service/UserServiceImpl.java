package tn.esprit.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userrep;
	
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);
	
	@Override
	public void addUser(User u) {
		userrep.save(u);
	}
	
	@Override
	public void deleteUser(User u) {
		
	}

	@Override
	public void updateUser(User u) {
	
	}
	
	@Override
	public void retrieveUser(User u) {
	
	}
	
	public void retrieveAllUsers() {
		
	}
	

}
