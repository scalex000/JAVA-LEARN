package com.example.lesson2;

import com.example.lesson1.Shape;
import com.example.lesson1.Circle;
import com.example.lesson1.Rectangle;
import com.example.lesson1.Square;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
