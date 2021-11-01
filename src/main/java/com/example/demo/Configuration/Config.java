package com.example.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class Config {


  public static final String DB_URL = "jdbc:mysql://localhost:3300/test";
  public static final String USER = "root";
  public static final String PASS = "root";


  @Bean
  public DataSource getDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUrl(DB_URL);
    dataSource.setUsername(USER);
    dataSource.setPassword(PASS);
    return dataSource;
  }

}
