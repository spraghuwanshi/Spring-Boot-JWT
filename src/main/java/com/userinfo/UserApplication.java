package com.userinfo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class UserApplication {
	public static void main(String[] args) throws Exception {
		new SpringApplication(UserApplication.class).run(args);
	}


}
