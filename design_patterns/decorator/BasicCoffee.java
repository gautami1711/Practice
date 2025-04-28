package design_patterns.decorator;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic coffee";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
}
