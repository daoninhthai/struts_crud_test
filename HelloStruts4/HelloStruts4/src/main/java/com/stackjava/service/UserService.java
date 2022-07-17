package com.stackjava.service;

import java.util.List;

import com.stackjava.dao.UserDAO;
import com.stackjava.models.User;

public class UserService {
	private UserDAO userDAO;
	public UserService() {
		userDAO = new UserDAO();
	}
	public List<User> getAllUser(){
		return userDAO.getAllUser();
	
	}
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}
	public void addUser(User user) {
		userDAO.addUser(user);
	}
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}
	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}
}
