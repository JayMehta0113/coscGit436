public class Client {
    public static void main(String [] args) {
        MenuItem roastBeef = new MenuItem(1, "Roast Beef", 15.99);
        MenuItem chickenKorma = new MenuItem(2, "Chicken Korma", 12.50);
        MenuItem jiaozi = new MenuItem(3, "Jiaozi", 8.75);

        Menu dinnerMenu = new Menu();
        dinnerMenu.addMenuItem(roastBeef);
        dinnerMenu.addMenuItem(chickenKorma);
        dinnerMenu.addMenuItem(jiaozi);

        Orders orders = new Orders();
        Aggregator aggregator = new Aggregator(dinnerMenu, orders);
        Invoker invoker = new Invoker(aggregator);

        System.out.println("Displaying Menu:\n");
        invoker.displayMenu();
        System.out.println();

        // Submit order
        System.out.println("Submitting Order:");
        invoker.submitOrder();
        System.out.println();

        // Display tab
        System.out.println("Displaying Tab:");
        invoker.displayTab();
    }
}
