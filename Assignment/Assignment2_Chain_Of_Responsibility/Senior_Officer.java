public class Senior_Officer extends AccountHandler{
    
    public Senior_Officer(int amount){
        this.amount=amount;
    }
    @Override
    protected void write(String message){
        System.out.println(message+" From Senior Officer");
    }
}
