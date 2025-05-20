package com;

public class Main {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.getDog();
        dog.speak();
        Animal cat = factory.getCat();
        cat.speak();
    }
}