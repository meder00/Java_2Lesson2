package com.geektech;

public class Square extends Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return a * 2;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE9");
    }
}
