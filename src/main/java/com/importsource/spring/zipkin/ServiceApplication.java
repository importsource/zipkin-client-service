package com.importsource.spring.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.SpanAccessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceApplication {

    /*@Bean
    Sampler customSampler() {
        return span -> Math.random() > .5;
    }*/



	@GetMapping("/hi")
	public String hi(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
