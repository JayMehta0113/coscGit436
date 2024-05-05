import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scanner = new Scanner(System.in);

        //adding items to menu
        MenuItem item1 = new MenuItem(1, "Pie", 10.00);
        MenuItem item2 = new MenuItem(2, "Chicken", 15.00);
        MenuItem item3 = new MenuItem(3, "Steak", 20.00);

        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        //creating inventory
        Inventory inventory = new Inventory();
        Kitchen kitchen = new Kitchen(inventory);
        inventory.addFood(item1, 3);
        inventory.addFood(item2, 3);
        inventory.addFood(item3, 3);

        //setting up other classes
        Orders orders = new Orders();
        Aggregator aggregator = new Aggregator(menu, orders);
        Invoker invoker = new Invoker();

        invoker.setAggregator(aggregator);

        //UI
        System.out.println("Welcome to Jay's Restaurant! \nPlease wait for Waiter to bring the menu.");

        // for(int i =0; i<3; i++){
        //     Thread.sleep(1000);
        //     System.out.println("*");
        // }
        // Thread.sleep(1000);
        
        invoker.displayMenu();


        System.out.println("Enter the item number of the dish you would like");
        int order = scanner.nextInt();

        while(order != 0){
            if(order > 0 && order <=3 ){
            invoker.submitOrder(new OrderItem(order));
            inventory.consumeFood(menu.getMenuByNumber(order), 1); // Decrease inventory
            System.out.println("Enter another dish or press 0 to finish ");
            order = scanner.nextInt();
            }
            else{
                System.out.println("please enter a number seen on the menu");
                order = scanner.nextInt();
            }   
        }


        invoker.displayTab();

        System.out.println("Ordering complete");
        
    
    }
}


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

public interface SystemInterface {

    public void displayMenu();

    public void submitOrder(OrderItem orderItem);

    public void displayTab();
}

public class Aggregator {

    private Menu menu;
    private Orders orders;

    public Aggregator(Menu menu, Orders orders){
        this.menu=menu;
        this.orders=orders;
    }


    public Menu getMenu(){
        return menu;
    }

    public Orders getOrders(){
        return orders;
    }

    public void addOrders(OrderItem orderItem){
        orders.addItem(orderItem);
    }
}

public class Invoker{

    private static Aggregator aggregator;

    public void setAggregator(Aggregator aggregator){
        Invoker.aggregator = aggregator;
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

public class MenuItem {

    private int itemNum;
    private String description;
    private double cost;

    public MenuItem(int itemNum, String description, double cost){
        this.itemNum=itemNum;
        this.description = description;
        this.cost = cost;
    }

    public int getItemNum(){
        return itemNum;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

    public String toString(){
        return("Item number " + itemNum + ": " + description + ". Price is $" + cost);
    }
}

public class OrderItem {
    private int itemNum;

    public OrderItem(int itemNum){
        this.itemNum = itemNum;
    }

    public int getItemNum(){
        return itemNum;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> MenuItems; 

    public Menu(){
        this.MenuItems = new ArrayList<>();
    }
    
    public void addItem(MenuItem MenuItem){
        MenuItems.add(MenuItem);
    }

    public List<MenuItem> getMenuItem(){
        return MenuItems;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<OrderItem> orderItems; 

    public Orders(){
        this.orderItems = new ArrayList<>();
    }
    
    public void addItem(OrderItem OrderItem){
        orderItems.add(OrderItem);
    }

    public List<OrderItem> getOrderItem(){
        return orderItems;
    }
}

public interface Command {

    public void execute();

}

public class DisplayMenu implements Command{

    private Aggregator aggregator;

    public DisplayMenu(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public void execute() {
       Menu menu = aggregator.getMenu();
       System.out.println("The menu is");
       for(int i =0; i<menu.getMenuItem().size(); i++){
            System.out.println(menu.getMenuItem().get(i));
       }
    }
    
}
