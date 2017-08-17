package com.vanish.orange;

import com.vanish.orange.controller.UserController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vanish.orange.dao")
public class OrangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeApplication.class, args);
	}
}
