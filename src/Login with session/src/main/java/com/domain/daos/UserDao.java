package com.domain.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.domain.config.MyConnection;
import com.domain.models.User;

public class UserDao {

	Connection connection = MyConnection.getConnection();

	public boolean saveUser(User user) {
		boolean savedUser = false;

		try {
			String query = "insert into user (name, email, phone) values (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPhone());
			preparedStatement.execute();
			savedUser = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return savedUser;
	}


public User loginUser(String email, String phone) {
	User user=null;
	
	try {
		String query="select * from user where email=? and phone=?";
		PreparedStatement preparedStatement= connection.prepareStatement(query);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, phone);
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			user= new User(resultSet.getInt("userid"), 
					resultSet.getString("name"), resultSet.getString("email"),
					resultSet.getString("phone"));
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return user;
}}
