package day8;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import day8.Daos.MovieDao;

public class MainClass {

	static void addMovie() {
		try {
			Scanner scanner = new Scanner(System.in);
			MovieDao movieDao = new MovieDao();

			System.out.println("Enter the name");
			String name = scanner.nextLine();
			System.out.println("Enter the release date (yyyy-mm-dd)");
			String releaseDateString = scanner.nextLine();

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date utilDate = dateFormat.parse(releaseDateString);
			java.sql.Date releaseDate = new java.sql.Date(utilDate.getTime());

			System.out.println("Enter language of the movie");
			String language = scanner.nextLine();
			Movie movie = new Movie(name, releaseDate, language);
			boolean addMovie = movieDao.addMovie(movie);
			if (addMovie) {
				System.out.println("Movie Added successfully");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	static void updateMovie() throws SQLException {
		try {
			Scanner scanner = new Scanner(System.in);
			MovieDao movieDao = new MovieDao();

			System.out.println("Enter the id");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter the name");
			String name = scanner.nextLine();
			System.out.println("Enter the release date (yyyy-mm-dd)");

			String releaseDateString = scanner.nextLine();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date utilDate = dateFormat.parse(releaseDateString);
			java.sql.Date releaseDate = new java.sql.Date(utilDate.getTime());

			System.out.println("Enter language of the movie");
			String language = scanner.nextLine();
			Movie movie = new Movie(name, releaseDate, language);
			boolean addMovie = movieDao.updateMovie(movie, id);
			if (addMovie) {
				System.out.println("Movie Updated successfully");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	static void getAllMovies() {
		try {
			MovieDao movieDao = new MovieDao();
			List<Movie> list = movieDao.getAllMovies();
			if (list.size() > 0) {
				System.out.println("Printing the list of movies...");
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {

//		addMovie();
//		getAllMovies();
		updateMovie();	

	}
}
