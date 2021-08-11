package com.domain.models;

import java.sql.Date;

public class Movie {

	int movieId;
	String movieName;
	String heroName, heroine, language, movieType;
	Date releaseDate;
	int length, productionId;
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", heroName=" + heroName + ", heroine="
				+ heroine + ", language=" + language + ", movieType=" + movieType + ", releaseDate=" + releaseDate
				+ ", length=" + length + ", productionId=" + productionId + "]";
	}

	public Movie(String movieName, String heroName, String heroine, String language, String movieType, Date releaseDate,
			int length, int productionId) {
		super();
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroine = heroine;
		this.language = language;
		this.movieType = movieType;
		this.releaseDate = releaseDate;
		this.length = length;
		this.productionId = productionId;
	}

	public Movie(int movieId, String movieName, String heroName, String heroine, String language, String movieType,
			 int length, int productionId, Date releaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroine = heroine;
		this.language = language;
		this.movieType = movieType;
		this.releaseDate = releaseDate;
		this.length = length;
		this.productionId = productionId;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getProductionId() {
		return productionId;
	}

	public void setProductionId(int productionId) {
		this.productionId = productionId;
	}

}
