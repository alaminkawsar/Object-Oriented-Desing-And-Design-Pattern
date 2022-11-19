public class Stock {

    private String stockName = "Hasibul";
    private int quantity = 10;

    public void buy(){
        System.out.println("Buy Stock Name: "+stockName);
        System.out.println("Quantity Is: "+quantity);
    }

    public void sell(){
        System.out.println("Sell Stock Name: "+stockName);
        System.out.println("Quantity Is: "+quantity);
    }
}