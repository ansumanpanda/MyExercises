package com.ansu.db.helper;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Component;

@Component
public class DBHelper {
	
	
	/*@Bean
	public DataSource dataSourceSA() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/spitter");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}*/
	
	
	@Bean
	@Autowired
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
		.setType(EmbeddedDatabaseType.H2)
		.addScript("classpath:schema.sql")
		.addScript("classpath:test-data.sql")
		.build();
	}
	
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}

}
