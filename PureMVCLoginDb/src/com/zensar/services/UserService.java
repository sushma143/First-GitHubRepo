package com.zensar.services;

import java.util.List;

import com.zensar.entity.User;
import com.zensar.exceptions.ServiceException;

public interface UserService {
	
	void addUser(User user)throws ServiceException;
	void updateUser(User user)throws ServiceException;
	void removeUser(User user)throws ServiceException;
	User findUserByUsername(String username)throws ServiceException;
	List<User> findAllUsers()throws ServiceException;
	
	boolean validateUser(User user)throws ServiceException;

}
