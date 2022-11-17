public class FactoryProducer {
    public AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedFactory();
        }
        return new FactoryShape();
    }
    
}
