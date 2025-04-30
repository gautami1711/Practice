package design_patterns.command;

public class TurnOffCommand implements Command{
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void undo() {
        light.turnOn();
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
