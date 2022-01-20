package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class DemoApplication {

  Logger logger = LoggerFactory.getLogger(DemoApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String home() {
  	String dummy = "Spring is here!";
    String event = UUID.randomUUID().toString();
    
    double x = 0.001;
    for (int i = 0; i < 1000000; i++) {
      x = java.lang.Math.sqrt(x);
    }

    logger.info(String.valueOf(x));
    logger.info(event);
    
    return dummy;
  }
}
