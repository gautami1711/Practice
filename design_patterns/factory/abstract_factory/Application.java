package design_patterns.factory.abstract_factory;

public class Application {
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    public void renderUI(){
        button.render();
        textBox.render();
    }
}
