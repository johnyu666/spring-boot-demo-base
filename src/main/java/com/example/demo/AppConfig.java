package com.example.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	@Bean
	public DataSource createDatasource() {
		System.out.println("create ds....");
		DriverManagerDataSource ds=new DriverManagerDataSource();
		return ds;
	}
}
