package com.Food.service;

import java.util.List;

import com.Food.entities.User;

public interface UserService {
	User createUser(User user);

	List<User> getAllUser();

	User getUserById(int id);

	User updateUser(int id, User user);

	String deleteUserById(int id);

	String deleteUsers();
}
