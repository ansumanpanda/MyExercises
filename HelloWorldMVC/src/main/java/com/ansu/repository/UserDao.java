package com.ansu.repository;

import com.ansu.entity.User;

public interface UserDao {

	public User findByName(String name);
	
}
