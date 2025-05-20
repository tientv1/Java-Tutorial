package com;

public class AnimalFactory {

    public Animal getDog() {
        return new Animal.Dog();  // hoặc return new Cat();
    }

    public Animal getCat() {
        return new Animal.Cat();
    }
}
