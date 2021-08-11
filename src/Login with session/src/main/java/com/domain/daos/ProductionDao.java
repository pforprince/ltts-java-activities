package com.domain.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;

import com.domain.config.MyConnection;
import com.domain.models.Production;


public class ProductionDao {

	Connection connection = MyConnection.getConnection();

	public boolean addProduction(Production production) throws SQLException {
		boolean productionAdded = false;
		try {
			String query = "insert into productions(productionname, address, startyear, ownername) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, production.getProductionName());
			preparedStatement.setString(2, production.getAddress());
			preparedStatement.setObject(3, Year.of(Integer.parseInt(production.getYear())).getValue());
			preparedStatement.setString(4, production.getOwnerName());
			preparedStatement.execute();
			productionAdded = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return productionAdded;
	}

	public java.util.List<Production> getAllProductions() throws SQLException {
		java.util.List<Production> allProductions = new ArrayList<>();
		try {
			String query = "select * from productions";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				allProductions.add(new Production(
						resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4),resultSet.getObject(5).toString()));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return allProductions;
	}

	public boolean updateProduction(Production production, int id) throws SQLException {
		boolean productionUpdated = false;
		try {
			String query = "update production set productionname=?, address=?,year=?, ownername=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, production.getProductionName());
			preparedStatement.setString(2, production.getAddress());
			preparedStatement.setObject(3, Year.of(Integer.parseInt(production.getYear())).getValue());
			preparedStatement.setString(4, production.getOwnerName());

			preparedStatement.executeUpdate();
			productionUpdated = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return productionUpdated;
	}

	public boolean deleteProduction(int id) throws SQLException {
		boolean productionDeleted = false;
		try {

			String query = "delete from productions where productionid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			productionDeleted = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return productionDeleted;
	}

}
