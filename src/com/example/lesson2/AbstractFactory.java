package com.example.lesson2;

import com.example.lesson1.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
