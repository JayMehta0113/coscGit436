import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu() {
        this.items = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item) {
        items.add(item);
    }
    public List<MenuItem> getItems() {
        return items;
    }
}
