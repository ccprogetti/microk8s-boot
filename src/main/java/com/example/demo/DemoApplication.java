package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.UUID;

@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication {

  @Autowired
  private Environment environment;


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String home() {
    String tmp = environment.getProperty("MICROK_8_S_BOOT_GIT_PORT_8080_TCP")
  	String dummy = "Spring is here again!" + tmp;
    String event = UUID.randomUUID().toString();
    log.info(event);
    return dummy;
  }
}
