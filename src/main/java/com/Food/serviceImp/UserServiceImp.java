package com.Food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.service.UserService;

import jakarta.transaction.Transactional;

import com.Food.entities.User;
import com.Food.repository.UserRepository;
@Transactional
@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserRepository us;
	
	@Override
	public User createUser(User user) {
		
		return us.save(user);
	}
	
	@Override
	public List<User>getAllUser() {               //Retrieves a list of all employee entities from the database
		List<User> le=us.findAll();
		return le;
	}
	@Override
	public User getUserById(int id) {             //Retrieves a specific employee entity by its ID from the database
		User s=us.findById(id).get();
		return s;
	}

	@Override
	public User updateUser(int id,User user) {       //update Retrieves the existing employee by ID using
		User s=us.findById(id).get();
		s.setUserName(user.getUserName());
		s.setEmail(user.getEmail());
		s.setAddress(user.getAddress());
		s.setPhoneNumber(user.getPhoneNumber());
		s.setPassword(user.getPassword());
		
		s.setUserType(user.getUserType());
		
		return us.save(s);
	}

	@Override
	public String deleteUserById(int id) {                     //Deletes a specific employee entity by its ID 
		us.deleteById(id);
		return "User is deleted";
	}

	@Override
	public String deleteUsers() {                                //Deletes all employee entities from the database
		us.deleteAll();
		return "All the Users are deleted";
	}


}