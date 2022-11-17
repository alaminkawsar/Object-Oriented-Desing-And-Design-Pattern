public class ShapeMaker {
    private Shape circle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
    }
    public void CircleDraw(){
        circle.draw();
    }

    public void SquareDraw(){
        square.draw();
    }
}
