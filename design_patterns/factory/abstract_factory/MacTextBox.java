package design_patterns.factory.abstract_factory;

public class MacTextBox implements TextBox{
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
