//subject

public interface InventorySubject {

    void addObserver(InventoryObserver observer);
    void removeObserver(InventoryObserver observer);
    void notifyObservers();

}
