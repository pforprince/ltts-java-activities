package day8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDao {

	Connection connection= myConnection.getConnection();

	public boolean addMovie(Movie movie) {
		boolean movieAdded = false;
		try {
			String query = "insert into movie(name, releaseDate, language) values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, movie.getName());
			preparedStatement.setDate(2, movie.getReleaseDate());
			preparedStatement.setString(3, movie.getLanguage());
			preparedStatement.execute();
			movieAdded = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return movieAdded;
	}

	public java.util.List<Movie> getAllMovies() {
		java.util.List<Movie> allMovies = new ArrayList<>();
		try {
			String query = "select * from movie";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				allMovies.add(new Movie(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3),
						resultSet.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return allMovies;
	}

	boolean updateMovie(Movie movie, int id) {
		boolean movieUpdated = false;
		try {
			String query = "update movie set name=?, releaseDate=?, language=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, movie.getName());
			preparedStatement.setDate(2, movie.getReleaseDate());
			preparedStatement.setString(3, movie.getLanguage());
			preparedStatement.executeUpdate();
			movieUpdated= true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return movieUpdated;
	}

}