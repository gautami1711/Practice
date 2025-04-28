package design_patterns.decorator.car;

public class SportsCarDecorator implements Car{
    private Car car;

    public SportsCarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble()+" with sports car features";
    }
}
