public class RoundedFactory extends AbstractFactory {

    public Shape getShape(String type){
        if(type=="Rectangle"){
            return new RoundedRectangle();
        }else if(type=="Square"){
            return new RoundedSquare();
        }
        return null;
    }
}
