package com.ansu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ansu.domain.Room;
import com.ansu.service.HotelServiceManger;
import com.ansu.service.RoomService;

//@Component
public class HotelServiceMangerImpl implements HotelServiceManger {

	@Autowired
	//@Qualifier(value="qualityInnHotelRoomService")
	//@Qualifier(value="holidayInnHotelRoomService")
	@Qualifier(value="roomService")
	private RoomService roomService;
	
	
	@Override
	public void getHotelRoomDetails(Room room) {
		System.out.println("HotelServiceMangerImpl :"+room.getRoomName());
		roomService.addRoom(room);
	}

}
