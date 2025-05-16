package com;

import com.objects.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Tom", 20);
        User user1 = new User("Tom1", 20);
        User user2 = new User("Tom2", 20);
        User[] users = {user, user1, user2};
        System.out.println(User.create(users, 3));
    }
}