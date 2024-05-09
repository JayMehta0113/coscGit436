import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tab {
    private Menu menu;
    private Orders orders;

    public Tab(Menu menu, Orders orders) {
        this.menu = menu;
        this.orders = orders;
    }
    public List<String> createTab() {
        double totalCost = 0;
        Map<Integer, Integer> itemCounts = new HashMap<>();
        List<OrderItem> orderItems = orders.getOrderItems();
        List<String> tab = new ArrayList<>();

        // Count the quantity of each item in the order
        for (OrderItem orderItem : orderItems) {
            int itemNumber = orderItem.getItemNumber();
            itemCounts.put(itemNumber, itemCounts.getOrDefault(itemNumber, 0) + 1);
        }

        // Generate tab including item quantities
        for (Map.Entry<Integer, Integer> entry : itemCounts.entrySet()) {
            MenuItem menuItem = findMenuItem(entry.getKey());
            if (menuItem != null) {
                double itemCost = menuItem.getItemCost() * entry.getValue();
                tab.add(menuItem.getItemDescription() + ": $" + itemCost + " (" + entry.getValue() + "x)");
                totalCost += itemCost;
            }
        }

        tab.add("Total cost is: $" + totalCost);
        return tab;
    }
    private MenuItem findMenuItem(int itemNumber) {
        for (MenuItem item : menu.getItems()) {
            if(item.getItemNumber() == itemNumber) {
                return item;
            }
        }
        return null;
    }
}