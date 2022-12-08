package com.brs.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {
   // @Bean
  //  @ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    //@Bean
   // @ConfigurationProperties("spring.datasource")
    public HikariDataSource dataSource(DataSourceProperties properties) {
        return dataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class)
                .build();
    }
    
    
    
    @Bean
    public DataSource customDataSource() {

//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//        dataSource.setUrl("jdbc:oracle:thin:@10.9.48.13:1555:rptdb");
//        dataSource.setUsername("rptusr");
//        dataSource.setPassword("Rptusr#1608");
    	
    	
    	 DriverManagerDataSource dataSource = new DriverManagerDataSource();
         dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://localhost:3306/batchdb?useSSL=false");
         dataSource.setUsername("root");
         dataSource.setPassword("Admin@123");

        return dataSource;

    }
}