package com.student.model;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name= "Admin")
public class Admin {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private  String name;



	@Column(name = "email_id")
	@NotNull
	private  String emailId;

	@Column(name = "password")
	@NotNull
	private  String Password;

	public Admin() {
	}




	public Admin(long id, String name, String emailId, String password) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		Password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}





	//

	
}
