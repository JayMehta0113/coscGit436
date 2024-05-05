public class SubmitOrder implements Command {

    private Aggregator aggregator;
    private OrderItem orderItem;

    public SubmitOrder(Aggregator aggregator, OrderItem orderItem){
        this.aggregator = aggregator;
        this.orderItem = orderItem;
    }

    public void execute() {
        aggregator.addOrders(orderItem);
    }

}