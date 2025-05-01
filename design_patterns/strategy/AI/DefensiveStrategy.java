package design_patterns.strategy.AI;

public class DefensiveStrategy implements Strategy{
    @Override
    public void execute() {
        System.out.println("Playing Defensively...");
    }
}
