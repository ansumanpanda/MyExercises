package com.ansu.core.beans;

public class Rectangle implements Shape {

private String type;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle is drawn");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
