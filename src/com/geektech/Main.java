package com.geektech;

public class Main {


    public static void main(String[] args) {
        // write your code here

//        Circle circle = new Circle(15);
//        circle.draw();
//        System.out.println(circle.calculatePerimeter());
//
//        Square square = new Square(3);
//        square.draw();
//        System.out.println(square.calculatePerimeter());
//
//        Triangle triangle = new Triangle(15,20,25);
//        triangle.draw();
//        System.out.println(triangle.calculatePerimeter());
//
//        System.out.println("____________");
//
        Dog dog = new Dog();
        dog.draw();

//        Figure[] figures = { circle,square,triangle};

//        for (Figure figure:figures) {
//            System.out.println(figure.calculatePerimeter());
//        }

        Draw[] draws = {new Circle(15), new Square(3), new Triangle(15, 20, 25), new Dog()};

        for (Draw draw : draws) {
            if (draw instanceof Figure) {
                System.out.println("Периметр " + draws.getClass().getSimpleName() +
                        ((Figure) draw).calculatePerimeter());
            }
            draw.draw();
            if (draw instanceof SoundProducable) {
                ((SoundProducable) draw).callSound();
            }
        }
    }
}
