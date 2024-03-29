//Concrete Command 1
public class LightsOnCommand implements Command {
    private Light light;
    public LightsOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }
}