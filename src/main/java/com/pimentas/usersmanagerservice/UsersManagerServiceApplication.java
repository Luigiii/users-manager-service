package com.pimentas.usersmanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class UsersManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersManagerServiceApplication.class, args);
	}

}
