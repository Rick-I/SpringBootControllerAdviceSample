package com.example.demo;

import java.util.Date;

public class DemoDto {
  
    private String name;
    private int age;
    private Date processedAt;

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getProcessedAt() {
      return processedAt;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProcessedAt(Date processedAt) {
      this.processedAt = processedAt;
    }
}
