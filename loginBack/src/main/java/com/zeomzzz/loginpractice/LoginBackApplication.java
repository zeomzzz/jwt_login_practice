package com.zeomzzz.loginpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LoginBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginBackApplication.class, args);
		
	}

}
