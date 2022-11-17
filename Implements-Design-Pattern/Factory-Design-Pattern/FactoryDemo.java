public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        System.out.println();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
