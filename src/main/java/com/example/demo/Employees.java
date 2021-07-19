package com.example.demo;

import java.time.LocalDate;

public class Employees {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private LocalDate dateOfBirth;
    private String email;

    public Employees() {
    }

    public Employees(Integer id, String name, Integer age, String address, LocalDate dateOfBirth, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Employees(String name, Integer age, String address, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}