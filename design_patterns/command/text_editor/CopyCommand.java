package design_patterns.command.text_editor;


import design_patterns.command.Command;

public class CopyCommand implements Command {
    private TextEditor textEditor;

    public CopyCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copy();
    }

    @Override
    public void undo() {

    }
}
