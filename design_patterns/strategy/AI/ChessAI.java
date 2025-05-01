package design_patterns.strategy.AI;

public class ChessAI {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void play(){
        strategy.execute();
    }
}
