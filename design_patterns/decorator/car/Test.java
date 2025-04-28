package design_patterns.decorator.car;

public class Test {
    public static void main(String[] args) {
        Car sportsCar=new SportsCarDecorator(new BasicCar());
        System.out.println(sportsCar.assemble());
    }
}
