package com.domain.models;

public class User {

	int id;
	String name;
	String email;
	String city;
	int age;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, String email, String city, int age) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.age = age;
	}
	public User(int id, String name, String email, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.age = age;
	}
	
}
