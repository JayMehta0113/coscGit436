//Concrete command 2
public class LightsOffCommand implements Command {
    private Light light;
    public LightsOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOff();
    }
}