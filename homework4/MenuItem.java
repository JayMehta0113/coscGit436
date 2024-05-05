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
