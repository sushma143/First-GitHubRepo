package com.zensar.daos;


import java.sql.SQLException;

/**
 * @author Sushma
 * @version 1.0
 * @creation_date 21st Sept 2019 5.23PM
 * @modification_date 21st Sept 2019 5.23PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description Java Bean class used to represent database entity. 
 * 				It is also used as value object. 
 *				
 */

import java.util.List;

import com.zensar.entity.User;

public interface UserDao {
	 void insert(User user)throws SQLException;
	 void update(User user)throws SQLException;
	 void delete(User user)throws SQLException;
	User getByUsername(String username)throws SQLException;
	 List<User>getAll() throws SQLException;

}
