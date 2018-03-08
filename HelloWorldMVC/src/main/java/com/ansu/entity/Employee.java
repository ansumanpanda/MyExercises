package com.ansu.entity;

import javax.validation.constraints.Size;

import org.springframework.context.annotation.PropertySource;

import com.sun.istack.internal.NotNull;


//@PropertySource("classpath:validationError.properties")
public class Employee {
	
	@NotNull
	@Size(min=2, max=5)
	private String name;
    private long id;
    private String contactNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
