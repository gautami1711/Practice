package design_patterns.strategy.AI;

public class AggresiveStrategy implements Strategy{
    @Override
    public void execute() {
        System.out.println("Playing aggressively...");
    }
}
