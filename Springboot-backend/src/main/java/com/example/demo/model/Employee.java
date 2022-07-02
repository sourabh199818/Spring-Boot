package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "employees")
public class Employee {

	public Employee(){

	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private  String firstname;
	
	@Column(name = "last__name")
	private  String lastname;
	
	@Column(name = "email_id")
	private  String emailId;
	
	public void setId(long id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Employee(String firstname, String lastname, String emailId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	
}
