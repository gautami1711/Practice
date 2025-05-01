package design_patterns.strategy.AI;

public class Test {
    public static void main(String[] args) {
        ChessAI ai=new ChessAI();
        ai.setStrategy(new AggresiveStrategy());
        ai.play();
    }
}
