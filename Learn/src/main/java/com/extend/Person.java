package com.extend;

public class Person {
    protected String name;
    protected int age;
    protected String address;

    public void say(String message) {
        System.out.println("Nói: " + message);
    }

    public void display() {
        System.out.println("Tên: " + this.name + " Tuổi: " + this.age + " Địa chỉ: " + this.address);
    }
}
