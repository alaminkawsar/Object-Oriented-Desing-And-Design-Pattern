public class SingleTone {
    private static SingleTone instances;
    private SingleTone(){}

    public static SingleTone getInstances(){
        if(instances==null){
            return new SingleTone();
        }
        return instances;
    }

    public void message(){
        System.out.println("Single Ton Object created");
    }
}
