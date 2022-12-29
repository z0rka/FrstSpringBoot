package com.example.frstspringboot;

import com.example.frstspringboot.model.ApplicationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FrstSpringBootApplication {

  @Autowired
  private ApplicationController controller;

  public static void main(String[] args) {
    SpringApplication.run(FrstSpringBootApplication.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void start() {
    controller.work();
  }

}
