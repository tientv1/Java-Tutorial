package com;

import com.entity.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("John 1").setAge(22).display();
        user.setName("John 1").setAge(22).display();
        user.setName("John 1").setAge(22).display();
        user.setName("John 1").setAge(22).display();
        // Nếu để như private String name; Ta không thể lấy thuộc tính như này --> user.name = "John 1";
        // Nhưng khi để public String name; user.name = "John 1" thì dùng được;
    }
}