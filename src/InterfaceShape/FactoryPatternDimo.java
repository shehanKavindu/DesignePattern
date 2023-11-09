package InterfaceShape;

public class FactoryPatternDimo {
    public static void main(String[] args) {
        ShapeMaker shapeFactory = new ShapeMaker();

        Shape shape01 = ShapeMaker.getShape("Circle");
shape01.draw();

        Shape shape02 = ShapeMaker.getShape("Rectangle");
        shape02.draw();

     Shape shape03 = shapeFactory.getShape("Squral");
      shape03.draw();

    }
}
