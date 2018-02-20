package com.ansu.domain;

public class Room {
	
	private Long roomId;
	private String roomName;
	private String roomType;
	private double roomRate;
	public Room(String roomName, String roomType, double roomRate) {
		super();
		this.roomName = roomName;
		this.roomType = roomType;
		this.roomRate = roomRate;
	}
	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomRate() {
		return roomRate;
	}
	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}

}
