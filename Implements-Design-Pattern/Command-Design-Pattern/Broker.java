import java.util.ArrayList;
import java.util.List;

public class Broker {
    
    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order){
        orders.add(order);
    }
    public void placeOrder(){
        for(Order order: orders){
            order.execute();
        }
    }
}
