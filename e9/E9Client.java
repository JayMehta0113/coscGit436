public class E9Client {
    public static void main(String [] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Command lightsOn = new LightsOnCommand(light);
        Command lightsOff = new LightsOffCommand(light);
        Command garageDoorOpen = new GarageOpenCommand(garageDoor);
        Command garageDoorClosed = new GarageClosedCommand(garageDoor);

        //Switch on Lights
        remote.setCommand(lightsOn);
        remote.pressButton();

        //Open garage door
        remote.setCommand(garageDoorOpen);
        remote.pressButton();

        //Switch off lights
        remote.setCommand(lightsOff);
        remote.pressButton();

        //Close garage door
        remote.setCommand(garageDoorClosed);
        remote.pressButton();
    }
}
