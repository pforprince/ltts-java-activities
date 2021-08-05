package day8;

import java.sql.Date;
import java.time.LocalDate;

public class Friend {

	String id;
	String name;
	Date dob;
	String creatorId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public Friend(String id, String name, Date dob, String creatorId) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.creatorId = creatorId;
	}
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
