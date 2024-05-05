import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<OrderItem> orderItems; 

    public Orders(){
        this.orderItems = new ArrayList<>();
    }
    
    public void addItem(OrderItem OrderItem){
        orderItems.add(OrderItem);
    }

    public List<OrderItem> getOrderItem(){
        return orderItems;
    }
}
