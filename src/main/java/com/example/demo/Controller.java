package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class Controller {

    private final employeeService service;

    @Autowired
    public Controller(employeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employees> employees(){
        return service.employees();
    }
}
