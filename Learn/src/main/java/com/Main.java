package com;

import com.entity.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Trần Văn Tiên", 21, "TP Đà Nẵng");
        User user1 = new User("Trần Văn Tiên 1", 21, "TP Đà Nẵng");
        User[] users = {user, user1};
        System.out.println(users[1]);
        user.display();
        user.say("Hello World!");
    }
}