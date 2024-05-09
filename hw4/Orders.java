import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<OrderItem> orderItems;

    public Orders() {
        this.orderItems = new ArrayList<>();
    }
    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
