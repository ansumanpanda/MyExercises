package com.ansu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.ansu.service.RoomService;
import com.ansu.service.impl.HolidayInnHotelRoomServiceImpl;
import com.ansu.service.impl.MarriotHotelRoomServiceImpl;
import com.ansu.service.impl.QualityInnHotelRoomServiceImpl;

import service.config.HotelServiceMangerConfig;

@ComponentScan(basePackages={"com.ansu"})
@Import(value={HotelServiceMangerConfig.class})
public class RoomConfig {
	
	@Bean
	public RoomService roomService()
	{
		return new MarriotHotelRoomServiceImpl();
	}
	
	@Bean
	public RoomService holidayInnHotelRoomService()
	{
		return new HolidayInnHotelRoomServiceImpl();
	}
	
	@Bean
	public RoomService qualityInnHotelRoomService()
	{
		return new QualityInnHotelRoomServiceImpl();
	}

}
