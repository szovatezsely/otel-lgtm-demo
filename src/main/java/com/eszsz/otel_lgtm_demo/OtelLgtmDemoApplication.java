package com.eszsz.otel_lgtm_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OtelLgtmDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtelLgtmDemoApplication.class, args);
	}

}
