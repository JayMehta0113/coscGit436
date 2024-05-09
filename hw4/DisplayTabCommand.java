import java.util.List;

public class DisplayTabCommand implements Command{
    private Aggregator aggregator;

    public DisplayTabCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }
    public void execute() {
        Menu menu = aggregator.getMenu();
        Orders orders = aggregator.getOrders();
        Tab tab = new Tab(menu, orders);
        List<String> tabItems = tab.createTab();

        for(String item: tabItems){
            System.out.println(item);
        }
    }
}
