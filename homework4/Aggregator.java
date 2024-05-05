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