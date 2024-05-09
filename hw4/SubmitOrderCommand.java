import java.util.Scanner;

public class SubmitOrderCommand implements Command{
    private Aggregator aggregator;

    public SubmitOrderCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter menu item numbers (separated by space): ");
        String input = in.nextLine();
        String[] items = input.split(" ");

        Orders orders = aggregator.getOrders();
        Menu menu = aggregator.getMenu();

        for (String item : items) {
            try {
                int itemNumber = Integer.parseInt(item);
                MenuItem menuItem = findMenuItem(menu, itemNumber);
                if (menuItem != null) {
                    orders.addOrderItem(new OrderItem(itemNumber));
                } else {
                    System.out.println("Invalid item number: " + itemNumber);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + item);
            }
        }
        System.out.println("Order placed");
    }
    private MenuItem findMenuItem(Menu menu, int itemNumber) {
        for (MenuItem menuItem : menu.getItems()) {
            if (menuItem.getItemNumber() == itemNumber) {
                return menuItem;
            }
        }
        return null;
    }
}
