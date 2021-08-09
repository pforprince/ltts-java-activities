package com.domain.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.domain.helpers.MyConnection;
import com.domain.models.User;

public class UserDao {

	public boolean saveUser(User user) {
		boolean userSaved=false;
		
		Connection connection= MyConnection.getConnection();
		try {
			String query="insert into user(name, email, city, age) values(?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(query);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getCity());
			preparedStatement.setInt(4, user.getAge());
			preparedStatement.execute();
			userSaved= true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return userSaved;
	}
	
}
