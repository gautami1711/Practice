package design_patterns.factory.abstract_factory;

import org.w3c.dom.Text;

public class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering Windows TextBox");
    }
}
