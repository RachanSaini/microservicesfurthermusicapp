package com.stackroute.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroServiceZuluApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceZuluApplication.class, args);
	}


}

