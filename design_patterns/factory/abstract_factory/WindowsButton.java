package design_patterns.factory.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering windows button");
    }
}
