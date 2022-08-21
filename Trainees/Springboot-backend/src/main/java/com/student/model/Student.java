package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "student")
public class Student {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name")
	private  String firstname;

	@Column(name = "last__name")
	private  String lastname;

	@Column(name = "email_id")
	private  String emailId;
	@Column(name = "father_name")
	private  String Father_name;

	@Column(name = "address")
	private  String Address;

	@Column(name = "phone_no")
	private  String Phone_no;

	@Column(name = "course")
	private  String Course;

	@Column(name ="role")
	private  String role;

	//
	public Student(long id, String firstname, String lastname, String emailId, String father_name, String address, String phone_no, String course) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
		Father_name = father_name;
		Address = address;
		Phone_no = phone_no;
		Course = course;
	}

	public Student(){

	}

	public Student(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFather_name() {
		return Father_name;
	}

	public void setFather_name(String father_name) {
		Father_name = father_name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}



	
}
