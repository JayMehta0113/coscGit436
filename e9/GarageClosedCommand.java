//Concrete command 2
public class GarageClosedCommand implements Command {
    private GarageDoor garageClosed;
    public GarageClosedCommand(GarageDoor garageClosed) {
        this.garageClosed = garageClosed;
    }
    public void execute() {
        garageClosed.garageClosed();
    }
}
