public class Invoker{

    private Aggregator aggregator;

    public void setAggregator(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public void displayMenu(){
        Command DisplayMenu = new DisplayMenu(aggregator);
        DisplayMenu.execute();
    }

    public void submitOrder(OrderItem OrderItem){
        Command SubmitOrder = new SubmitOrder(aggregator, OrderItem);
        SubmitOrder.execute();
    }

    public void displayTab(){
        Command DisplayTab = new DisplayTab(aggregator);
        DisplayTab.execute();
    }


}