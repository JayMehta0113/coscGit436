//concrete subject

import java.util.*;

public class Inventory implements InventorySubject {
    private List<InventoryObserver> observers = new ArrayList<>();
    private Map<MenuItem, Integer> foodInventory = new HashMap<>();

    public void addFood(MenuItem menuItem, int quantity) {
        foodInventory.put(menuItem, foodInventory.getOrDefault(menuItem, 0) + quantity);
        notifyObservers();
    }

    public void consumeFood(MenuItem menuItem, int quantity) {
        if (foodInventory.containsKey(menuItem)) {
            int currentQuantity = foodInventory.get(menuItem);
            if (currentQuantity >= quantity) {
                foodInventory.put(menuItem, currentQuantity - quantity);
                notifyObservers();
            } else {
                System.out.println("Not enough " + menuItem.getDescription() + " in inventory!");
            }
        } else {
            System.out.println(menuItem.getDescription() + " is not in inventory!");
        }
    }

    @Override
    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(InventoryObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (InventoryObserver observer : observers) {
            observer.update();
        }
    }
}
