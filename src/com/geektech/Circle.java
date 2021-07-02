package com.geektech;

public class Circle extends Figure{

    private int radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) ((Math.PI * radius) * 2);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD34");

    }
}
