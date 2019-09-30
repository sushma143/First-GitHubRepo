package com.zensar.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Sushma
 * @version 1.0
 * @creation_date 21st Sept 2019 5.23PM
 * @modification_date 21st Sept 2019 5.23PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is data  access object Interface implentation. 
 * 				It is also used in Persistent Layer of Application. 
 *				
 */


import java.util.List;

import com.zensar.entity.User;

public class UserDaoImpl implements UserDao {

	private Connection connection;
	
	
	
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void insert(User user)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO USER_LOGIN VALUES(?)";
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setString(1,user.getUsername());
		pstmt.setString(2,user.getPassword());
		int insertCount=pstmt.executeUpdate();
		if(insertCount>0)
			System.out.println("New User Inserted");
		else
			System.out.println("Sorry! Not Inserted new user");
				
		

	}

	@Override
	public void update(User user)throws SQLException {
		// TODO Auto-generated method stub
		
		String sql="UPDATE USER_LOGIN SET PASSWORD=? WHERE USERNAME=?";
				PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getUsername());
		int updateCount=pstmt.executeUpdate();
		if(updateCount>0)
		{
			System.out.println("User record is updated");
			
		}
		else 
			System.out.println("Sorry record is not updated");
		

	}

	@Override
	public void delete(User user)throws SQLException {
		// TODO Auto-generated method stub
		
		String sql= "DELETE FROM USER_LOGIN WHERE USERNAME=?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.setString(1, user.getUsername());
				int deleteCount=pstmt.executeUpdate();
				if(deleteCount>0)
				{
					System.out.println("User record is deleted");
					
				}
				else 
					System.out.println("Sorry record is not deleted");
				

			}
		
	
	@Override
	public User getByUsername(String username)throws SQLException {
		// TODO Auto-generated method stub
		String sql ="SELECT USERNAME,PASSWORD FROM USER_LOGIN WHERE USERNAME=?";
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setString(1, username);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		}
		else {
			return null;
		}
		

	}

	@Override
	public List<User> getAll()throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT USERNAME, PASSWORD FROM USER_LOGIN";
		Statement stmt=connection.createStatement();
		ResultSet rs =stmt.executeQuery(sql);
		List<User> users = new ArrayList<User>();
		while(rs.next()) {
			User user =new User();
			user.setUsername(rs.getString(1));
		
			user.setPassword(rs.getString(2));
			users.add(user);
			
		}
		
		return users;
	}

}
