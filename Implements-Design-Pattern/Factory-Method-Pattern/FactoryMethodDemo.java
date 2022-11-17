public class FactoryMethodDemo {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory factory = producer.getFactory(false);
        Shape rectangle = factory.getShape("Square");
        //System.out.println(rectangle);
        rectangle.draw();

        factory = producer.getFactory(true);
        Shape square = factory.getShape("Square");
        square.draw();


    }
}
