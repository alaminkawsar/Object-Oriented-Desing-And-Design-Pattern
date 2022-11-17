public class ShapeFactory {
    public Shape getShape(String type){
        if(type==null){
            return null;
        }else if(type=="Circle"){
            return new Circle();
        }else if(type=="Rectangle"){
            return new Rectangle();
        }else if(type=="Square"){
            return new Square();
        }

        return null;
    }
}
