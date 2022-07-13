package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User{
	
	
	@Id
	private long id;
	private String Username;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
}