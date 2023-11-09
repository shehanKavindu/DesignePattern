package InterfaceShape;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ShapeMaker {
    private Shape Circle;
    private Shape Rectangle;
    private Shape Squral;

    public ShapeMaker(){
    Circle = new Circle();
    Rectangle=new Rectangle();
    Squral = new Squral();
    }

    public static Shape getShape(String circle) {
    }

    public void DrawCircle(){
        Circle.draw();
    }
    public void DrawRectangle(){
        Rectangle.draw();

    }
    public void DrawSqural(){
        Squral.draw();

    }

}

