package com.ansu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ansu.service.RoomService;
import com.ansu.service.impl.MarriotHotelRoomServiceImpl;

@ComponentScan(basePackages="com.ansu")
public class RoomConfig {
	
	@Bean
	public RoomService marriotHotelRoomService()
	{
		return new MarriotHotelRoomServiceImpl();
	}

}
