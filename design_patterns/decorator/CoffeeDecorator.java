package design_patterns.decorator;

public abstract class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }

    public String getDescription(){
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return 120.0;
    }
}
