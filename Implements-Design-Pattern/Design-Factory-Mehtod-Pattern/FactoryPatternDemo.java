public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        Shape shape3 = shapeFactory.getShape("Square");
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}