public class Cashier extends AccountHandler{
    
    public Cashier(int amount){
        this.amount=amount;
    }
    @Override
    protected void write(String message){
        System.out.println(message+" From Cashier");
    }
}
