package design_patterns.command;

public class Test {
    public static void main(String[] args) {
        Light light=new Light();
        Command turnOn=new TurnOnCommand(light);
        Command turnOff= new TurnOffCommand(light);

        RemoteControl remote=new RemoteControl();
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
        remote.pressUndo();
        remote.pressUndo();
    }
}
