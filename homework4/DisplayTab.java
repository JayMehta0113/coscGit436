import java.util.List;

public class DisplayTab implements Command {

    
    private Aggregator aggregator;

    public DisplayTab(Aggregator aggregator){
        this.aggregator = aggregator;
    }
   
    public void execute() {
        
        Menu menu = aggregator.getMenu();
        Orders orders = aggregator.getOrders();
        Tab tab = new Tab(menu, orders);
        List<String> tabItems = tab.getTab();

        for(String item: tabItems){
            System.out.println(item);
        }

    }


}