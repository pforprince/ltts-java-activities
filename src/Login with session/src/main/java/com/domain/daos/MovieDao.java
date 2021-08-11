package com.domain.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.domain.config.MyConnection;
import com.domain.models.Movie;

public class MovieDao {

	Connection connection = MyConnection.getConnection();

	public boolean addMovie(Movie movie) throws SQLException {
		boolean savedMovie = false;
		try {

			String query = "insert into movie (moviename, heroname, heroine,releasedDate,language, length,movietype,productionid) values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, movie.getMovieName());
			preparedStatement.setString(2, movie.getHeroName());
			preparedStatement.setString(3, movie.getHeroine());
			preparedStatement.setDate(4, movie.getReleaseDate());
			preparedStatement.setString(5, movie.getLanguage());
			preparedStatement.setInt(6, movie.getLength());
			preparedStatement.setString(7, movie.getMovieType());
			preparedStatement.setInt(8, movie.getProductionId());
			preparedStatement.execute();
			savedMovie = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return savedMovie;
	}

	public Movie getMovieById(int id) {
		Movie movie = null;
		System.out.println("============"+ id);
		try {
			String query = "select * from movie where movieid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				movie=new Movie(resultSet.getInt("movieid"), resultSet.getString("Moviename"),
						resultSet.getString("Heroname"), resultSet.getString("Heroine"),
						resultSet.getString("Language"), resultSet.getString("Movietype"), resultSet.getInt("Length"),
						resultSet.getInt("Productionid"), resultSet.getDate("Releaseddate"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return movie;
	}

	public List<Movie> getAllMovies() throws SQLException {
		List<Movie> allMovies = new ArrayList<Movie>();
		try {
			String query = "select * from movie";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				allMovies.add(new Movie(resultSet.getInt("movieid"), resultSet.getString("Moviename"),
						resultSet.getString("Heroname"), resultSet.getString("Heroine"),
						resultSet.getString("Language"), resultSet.getString("Movietype"), resultSet.getInt("Length"),
						resultSet.getInt("Productionid"), resultSet.getDate("Releaseddate")));

			}
			System.out.println("====================");

			System.out.println(allMovies);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return allMovies;
	}

	public boolean updateMovie(Movie movie, int id) throws SQLException {
		boolean movieUpdated = false;
		try {

			String query = "update movie set moviename=?, heroname=?, heroine=?,releasedDate=?,language=?, length=?,movietype=?,productionid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, movie.getMovieName());
			preparedStatement.setString(2, movie.getHeroName());
			preparedStatement.setString(3, movie.getHeroine());
			preparedStatement.setDate(4, movie.getReleaseDate());
			preparedStatement.setString(5, movie.getLanguage());
			preparedStatement.setInt(6, movie.getLength());
			preparedStatement.setString(7, movie.getMovieType());
			preparedStatement.setInt(8, movie.getProductionId());
			preparedStatement.execute();
			movieUpdated = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return movieUpdated;
	}

	public boolean deleteMovie(int id) throws SQLException {
		boolean movieDeleted = false;
		try {

			String query = "delete from movie where movieid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);

			preparedStatement.execute();
			movieDeleted = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return movieDeleted;
	}

}
