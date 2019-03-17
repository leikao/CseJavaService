package com.huawei.videosaas.cse.application.controller;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestService {

  ServiceDelegate vodDelegate = new ServiceDelegate();


  @Test
  public void testhelloworld() {

    String expactReturnValue = "hello"; // You should put the expect String type value here.

    String returnValue = vodDelegate.helloworld("hello");

    assertEquals(expactReturnValue, returnValue);
  }

}