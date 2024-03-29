//Invoker 
public class RemoteControl {
    private Command command;
    public RemoteControl() {

    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
