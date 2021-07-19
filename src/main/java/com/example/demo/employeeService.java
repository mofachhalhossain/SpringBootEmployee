package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class employeeService {
    @GetMapping
    public List<Employees> employees(){
        return List.of(
                new Employees(
                        "Joe",
                        23,
                        "Dhaka",
                        LocalDate.of(1997, Month.JULY,8),
                        "Joe@gmail.com"
                )
        );
    }
}
