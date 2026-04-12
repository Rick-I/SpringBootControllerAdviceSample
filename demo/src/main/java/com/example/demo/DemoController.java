package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @PostMapping("test")
  public DemoDto getMethodName(@RequestBody DemoDto demoDto) {
    return demoDto;
  }

}