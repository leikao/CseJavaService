package com.huawei.videosaas.cse.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ServiceDelegate {

  @Value("${someKeyFromApollo:someDefaultValue}")
  private String dsn;

  public String helloworld(String name) {

    // Do Some Magic Here!
    return name;
  }
}
