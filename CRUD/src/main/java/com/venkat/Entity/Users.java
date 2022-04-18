package com.venkat.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sno")
	private int sno;
	@Column(name="name")
	private String name;
	@Column(name="designation")
	private String designation;
	@Column(name="email")
	private String email;
	
		public Users(String name, String designation, String email) {
		super();
		this.name = name;
		this.designation = designation;
		this.email = email;
	}
	
	
	public Users(int sno, String name, String designation, String email) {
		super();
		this.sno = sno;
		this.name = name;
		this.designation = designation;
		this.email = email;
	}


	public Users() {
		
			}
	
		public Users(int sno) {
		super();
		this.sno = sno;
	}



	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Users [sno=" + sno + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
	

}
