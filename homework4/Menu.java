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

    public MenuItem getMenuByNumber(int orderNum){
        return MenuItems.get(orderNum-1);
    }
}
