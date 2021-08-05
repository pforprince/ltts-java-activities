package day8;

import java.sql.Date;

public class Movie {

	int id;
	String name;
	Date releaseDate;
	String language;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Movie(int id, String name, Date releaseDate, String language) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.language = language;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String name, Date releaseDate, String language) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", releaseDate=" + releaseDate + ", language=" + language + "]";
	}
	
}
