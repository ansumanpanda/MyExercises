package com.ansu.service.impl;

import com.ansu.domain.Room;
import com.ansu.service.RoomService;

public class MarriotHotelRoomServiceImpl implements RoomService{

	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		System.out.println("Inside MarriotHotelRoomServiceImpl :"+room.getRoomName());
		
	}

}
