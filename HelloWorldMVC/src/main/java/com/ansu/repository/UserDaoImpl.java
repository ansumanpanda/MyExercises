package com.ansu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ansu.entity.User;

public class UserDaoImpl implements UserDao {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Override
	public User findByName(String name) {
		return jdbcTemplate.queryForObject("select * from user where name=?", new Object[] {
	            name
	        },
	        new BeanPropertyRowMapper < User > (User.class));
	}


}
