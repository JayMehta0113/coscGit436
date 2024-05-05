import java.util.*;

public class Tab {
    private Menu menu;
    private Orders orders;

    public Tab(Menu menu, Orders orders){
        this.menu = menu;
        this.orders = orders;
    }

    public List<String> getTab(){

        double totalCost = 0;

        List<String> tab = new ArrayList<>();

        for (OrderItem orderItem : orders.getOrderItem()) {
            MenuItem menuItem = menu.getMenuItem().get(orderItem.getItemNum()-1);
            totalCost = totalCost + menuItem.getCost();
            tab.add(menuItem.getDescription() + ": $" + menuItem.getCost());
        }
        tab.add("Total cost is: $"+totalCost);
        return tab;
    }
}
