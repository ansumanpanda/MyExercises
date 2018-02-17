package com.ansu.core.beans;

public class Circle implements Shape {

	private String type;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
