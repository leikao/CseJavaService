package com.huawei.videosaas.cse.application;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class CseApp {

  public static void main(String[] args) {

    SpringApplication.run(CseApp.class, args);
  }
}
