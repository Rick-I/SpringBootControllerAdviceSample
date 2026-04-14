package com.example.demo;

import java.util.Date;

public class DemoDto {

    private int id;
    private Date processedAt;

    // getter
    public int getId() {
        return id;
    }

    public Date getProcessedAt() {
        return processedAt;
    }

    // setter
    public void setAge(int id) {
        this.id = id;
    }

    public void setProcessedAt(Date processedAt) {
        this.processedAt = processedAt;
    }
}
