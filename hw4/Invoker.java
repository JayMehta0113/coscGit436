public class Invoker {
    private Aggregator aggregator;

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }
    public void displayMenu() {
        Command command = new DisplayMenuCommand(aggregator.getMenu());
        command.execute();
    }
    public void submitOrder() {
        Command command = new SubmitOrderCommand(aggregator);
        command.execute();
    }
    public void displayTab() {
        Command command = new DisplayTabCommand(aggregator);
        command.execute();
    }
}
