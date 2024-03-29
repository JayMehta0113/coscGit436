//Concrete command 1
public class GarageOpenCommand implements Command {
    private GarageDoor garageOpen;
    public GarageOpenCommand(GarageDoor garageOpen) {
        this.garageOpen = garageOpen;
    }
    public void execute() {
        garageOpen.garageOpen();
    }
}
