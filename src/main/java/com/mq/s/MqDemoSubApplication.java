package com.mq.s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class MqDemoSubApplication {

  public static void main(String[] args) {
    SpringApplication.run(MqDemoSubApplication.class, args);
  }
}
