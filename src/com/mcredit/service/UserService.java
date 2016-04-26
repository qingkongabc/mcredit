package com.mcredit.service;

import java.util.List;

import com.mcredit.model.User;


public interface UserService {
	void insertUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int id);
	List<User> selectUser(User user);
}
