package org.example.structural.decorator;

import org.example.structural.decorator.decorators.ShapeColorDecorator;
import org.example.structural.decorator.models.Circle;
import org.example.structural.decorator.models.Rectangle;
import org.example.structural.decorator.models.Shape;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();


        Shape decoratedRectangle = new ShapeColorDecorator(new Rectangle());
        decoratedRectangle.draw();
    }
}
