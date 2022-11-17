public class FactoryShape extends AbstractFactory {
    public Shape getShape(String typeShape){
        if(typeShape=="Rectangle"){
            return new Rectangle();
        }else if(typeShape=="Square"){
            return new Square();
        }
        return null;
    }
}
