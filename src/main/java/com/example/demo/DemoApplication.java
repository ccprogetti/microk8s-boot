package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication {

  private String password = "password";
  private String password1 = "password";
  

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String home() {
  	String dummy = "Spring is here!";
    String event = UUID.randomUUID().toString();
    log.info(event);
    return dummy;
  }
}
