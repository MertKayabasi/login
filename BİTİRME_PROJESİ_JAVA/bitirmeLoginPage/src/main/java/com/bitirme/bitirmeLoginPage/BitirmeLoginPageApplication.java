package com.bitirme.bitirmeLoginPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.bitirme.bitirmeloginPage.controller,"+
		"com.bitirme.bitirmeLoginPage")
public class BitirmeLoginPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitirmeLoginPageApplication.class, args);
		System.out.println("hadi başla");
	}

}
