import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scanner = new Scanner(System.in);

        RestaurantFacade location1 = new RestaurantFacade();
        location1.createMenuItem(1, "hotdog", 10.00, 3);
        location1.createMenuItem(2, "chicken", 15.00, 3);
        location1.createMenuItem(3, "steak", 20.00, 3);
    
        RestaurantFacade location2 = new RestaurantFacade();
        location2.createMenuItem(1, "pie", 5.00, 3);
        location2.createMenuItem(2, "icecream", 3.00, 3);
        location2.createMenuItem(3, "cake", 10.00, 3);


        //UI
        
        location1.showMenu();

        location1.placeOrder(scanner);

        location1.showTab();

        System.out.println("Ordering complete");
        
        location2.showMenu();

        location2.placeOrder(scanner);
        
        location2.showTab();
    
    }
}
