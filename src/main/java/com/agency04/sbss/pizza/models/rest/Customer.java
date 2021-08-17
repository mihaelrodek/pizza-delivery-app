package com.agency04.sbss.pizza.models.rest;

import com.agency04.sbss.pizza.models.Sex;

public class Customer {

    private String username;

    private String name;

    private String surname;

    private Sex sex;

    private int age;

    public Customer() {
    }

    public Customer(String username, String name, String surname, Sex sex, int age) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}