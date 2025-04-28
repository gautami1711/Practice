package design_patterns.decorator;

public class MilkDecorator extends CoffeeDecorator{
    @Override
    public double getCost() {
        return super.getCost()+20.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",Milk";
    }

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
}
