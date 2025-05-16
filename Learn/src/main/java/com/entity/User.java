package com.entity;

import com.extend.Person;

public class User extends Person {

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

//    private String name;
//    private int age;
//
//    public User setName (String name) {
//        this.name = name;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public User setAge (int age) {
//        this.age = age;
//        return this;
//    }
//
//    public void display() {
//        System.out.println("Tên: " + this.name +
//                "\n" +
//                "Tuổi: " + this.age);
//    }
}