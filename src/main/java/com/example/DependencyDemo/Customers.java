package com.example.DependencyDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private String id;
    private String CustomerName;
    private String CourseName;
    @Autowired
    private Technologies technologies;

    public Technologies getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technologies technologies) {
        this.technologies = technologies;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public void display(){
        System.out.println("Object created successfully");
        technologies.display();
    }
}
