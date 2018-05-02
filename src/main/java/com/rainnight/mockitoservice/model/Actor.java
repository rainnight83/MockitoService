package com.rainnight.mockitoservice.model;

public class Actor {
	private String id;
	private String name;
	private String department;
	private String designation;
	private String phone;
	private String email;
	private boolean active;
	
	public Actor(){}
	
	public Actor(String id, String name, String department, String email)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.email = email;
		this.active = true;
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
