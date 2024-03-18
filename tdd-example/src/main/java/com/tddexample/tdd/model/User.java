package com.tddexample.tdd.model;

import java.io.Serializable;
import java.util.Objects;



public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String email;
	private String password;
	private String name;
	
	public User() {
		super();
	}

	public User(long id, String email, String password, String name) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
	}


	@Override
	public String toString() {
		return "{id=" + id + ", email='" + email + "', name='" + name + "', ";
	}
	
	
}
