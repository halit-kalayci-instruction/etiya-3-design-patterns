package org.example.structural.decorator.decorators;

import org.example.structural.decorator.models.Shape;

public class ShapeColorDecorator extends ShapeDecorator {
    public ShapeColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Shape'in rengi değiştirildi.");
        super.draw();
    }
}
