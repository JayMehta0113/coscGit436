public class MenuItem {
    private int itemNumber;
    private String itemDescription;
    private double itemCost;

    public MenuItem(int itemNumber, String itemDescription, double itemCost) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.itemCost = itemCost;
    }
    public int getItemNumber() {
        return itemNumber;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public double getItemCost() {
        return itemCost;
    }
}
