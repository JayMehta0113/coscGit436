//concrete observer

public class Kitchen implements InventoryObserver {
    private Inventory inventory;

    public Kitchen(Inventory inventory) {
        this.inventory = inventory;
        inventory.addObserver(this);
    }

    @Override
    public void update() {

    }
}