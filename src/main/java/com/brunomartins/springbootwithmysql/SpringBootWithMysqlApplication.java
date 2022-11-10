package com.brunomartins.springbootwithmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.brunomartins.springbootwithmysql")
@EntityScan(basePackages = "com.brunomartins.springbootwithmysql.model")
public class SpringBootWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMysqlApplication.class, args);
	}

}
