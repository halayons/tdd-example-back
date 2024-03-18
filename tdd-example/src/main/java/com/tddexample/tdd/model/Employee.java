package com.tddexample.tdd.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee extends User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4292074026879335726L;
	// place your code here
	private String phone;
	private LocalDate dateOfBirth;
	public Employee() {
		super();
	}
	public Employee(long id, String email, String password, String name,String phone, LocalDate dateOfBirth) {
		super(id, email, password, name);
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Employee"+super.toString()+"phone='" + phone + "', dateOfBirth=" + dateOfBirth + "}";
	}
	
	
}
