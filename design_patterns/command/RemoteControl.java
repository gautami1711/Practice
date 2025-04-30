package design_patterns.command;

import java.util.Stack;

public class RemoteControl {
    private Command command;
    private final Stack<Command> history=new Stack<>();

    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
        history.push(command);
    }

    public void pressUndo(){
        if(!history.isEmpty()){
            Command lastCommand=history.pop();
            lastCommand.undo();
        }else {
            System.out.println("No previous command");
        }
    }
}
