package com.ansu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ansu.domain.RoomDetails;

@Configuration
public class RoomDetailsConfig {

	@Bean
	public RoomDetails RoomDetails()
	{
		return new RoomDetails(3L, false, true);
	}
	
}
