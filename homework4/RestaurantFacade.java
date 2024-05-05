//facade pattern
import java.util.Scanner;

public class RestaurantFacade {
    private Menu menu;
    private Inventory inventory;
    private Orders orders;
    private Aggregator aggregator;
    private Invoker invoker;

    public RestaurantFacade() {
        this.menu = new Menu();
        this.orders = new Orders();
        this.aggregator = new Aggregator(menu, orders);
        this.inventory = new Inventory(); // Assuming you have a constructor for Inventory class
        this.invoker = new Invoker();

        this.invoker.setAggregator(aggregator);
    }

    public void createMenuItem(int itemNum, String description, double cost, int numOfItems){
        MenuItem menuItem = new MenuItem(itemNum, description, cost);
        menu.addItem(menuItem);
        inventory.addFood(menuItem ,numOfItems);
    }

    public void setInventory(){

    }

    public void showMenu() throws InterruptedException{
        System.out.println("Welcome to Jay's fast food! \nPlease wait for Waiter to bring the menu.");

        for(int i =0; i<3; i++){
            Thread.sleep(1000);
            System.out.println("*");
        }
        Thread.sleep(1000);
        
        invoker.displayMenu();
    }

    public void placeOrder(Scanner scanner){
        System.out.println("Enter the item number of the dish you would like");
        int order = scanner.nextInt();

        while(order != 0){
            if(order > 0 && order <=3 ){
            inventory.consumeFood(menu.getMenuByNumber(order), 1);
            invoker.submitOrder(new OrderItem(order)); 
            System.out.println("Enter another dish or press 0 to finish ");
            order = scanner.nextInt();
            }
            else{
                System.out.println("please enter a number seen on the menu");
                order = scanner.nextInt();
            }   
        }
    }

    public void showTab(){
        invoker.displayTab();
    }
}
