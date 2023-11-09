package Facade;

import InterfaceShape.Circle;
import InterfaceShape.Rectangle;
import InterfaceShape.Shape;
import InterfaceShape.Squral;

public class ShapeFactory {
    public static Shape getShape(String ShapeType) {
        if (ShapeType == null) {
            return null;
        }
        if (ShapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        if (ShapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();

        }

        if (ShapeType.equalsIgnoreCase("Squral")) {
            return new Squral();
        }
        return null;
    }
}



