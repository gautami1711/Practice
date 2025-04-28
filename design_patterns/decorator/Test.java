package design_patterns.decorator;

public class Test {
    public static void main(String[] args) {
        Coffee coffee=new BasicCoffee();
        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" and cost is: "+coffee.getCost());
    }
}
