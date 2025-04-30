package design_patterns.factory.abstract_factory;

public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}
