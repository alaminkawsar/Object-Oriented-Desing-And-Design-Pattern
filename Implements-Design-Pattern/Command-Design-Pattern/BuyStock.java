public class BuyStock implements Order{
    private Stock stock;
    public BuyStock(Stock stock){
        this.stock = stock;
    }
    public void execute(){
        stock.buy();
    }
}
