package com.ansu.domain;

public class RoomDetails {
	
	private Long noOfBeds;
	private boolean smoking;
	private boolean hasMicrowave;
	public RoomDetails(Long noOfBeds, boolean smoking, boolean hasMicrowave) {
		super();
		this.noOfBeds = noOfBeds;
		this.smoking = smoking;
		this.hasMicrowave = hasMicrowave;
	}
	public Long getNoOfBeds() {
		return noOfBeds;
	}
	public void setNoOfBeds(Long noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	public boolean isHasMicrowave() {
		return hasMicrowave;
	}
	public void setHasMicrowave(boolean hasMicrowave) {
		this.hasMicrowave = hasMicrowave;
	}
	
	
	

}
