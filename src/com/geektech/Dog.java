package com.geektech;

public class Dog extends Animal{

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC36");
    }

    @Override
    public void callSound() {
        System.out.println(" гав гав");
    }
}
