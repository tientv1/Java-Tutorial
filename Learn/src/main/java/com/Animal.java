package com;

public interface Animal {
    void speak();

    public class Dog implements Animal {

        @Override
        public void speak() {
            System.out.println("Gâu gâu!");
        }
    }

    public class Cat implements Animal {

        @Override
        public void speak() {
            System.out.println("Meo meo!");
        }
    }
}
