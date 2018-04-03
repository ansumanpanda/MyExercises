package com.ansu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ansu.entity.Student;

@Repository
public class StudentJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    

public Student findById(long id) {
    return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] {
            id
        },
        new BeanPropertyRowMapper < Student > (Student.class));
}


/*public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}


public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}*/

}
