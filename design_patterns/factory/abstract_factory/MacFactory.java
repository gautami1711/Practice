package design_patterns.factory.abstract_factory;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
