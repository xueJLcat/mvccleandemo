package com.xuejl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

  @RequestMapping(value = "/quick")
  public String demo01() {
    System.out.println("springmvc run....");
    return "hello";
  }
}
