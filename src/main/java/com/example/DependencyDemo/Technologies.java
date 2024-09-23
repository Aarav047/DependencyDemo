package com.example.DependencyDemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;

@Component
public class Technologies {
    private String techId;
    private String techName;

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }
    public void display(){
        System.out.println("Completed");
    }
}
