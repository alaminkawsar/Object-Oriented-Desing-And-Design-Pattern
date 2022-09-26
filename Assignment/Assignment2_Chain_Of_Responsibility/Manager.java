public class Manager extends AccountHandler{
    
    public Manager(int amount){
        this.amount=amount;
    }
    @Override
    protected void write(String message){
        System.out.println(message+ " From Manager");
    }
}
