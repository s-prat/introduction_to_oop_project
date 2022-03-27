package com.techreturners.oops;

public class Parrot extends Bird{
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Hi!! i am Mithu");
    }
}
