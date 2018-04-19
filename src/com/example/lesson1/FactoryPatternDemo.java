package com.example.lesson1;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and Call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //call draw method of circle
        shape1.draw();

        //get an object of Rectangle and Call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //call draw method of rectangle
        shape2.draw();

        //get an object of Square and Call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //call draw method of rectangle
        shape3.draw();



    }
}
