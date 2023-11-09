package Facade;

import InterfaceShape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Implement Draw");
    }
}
