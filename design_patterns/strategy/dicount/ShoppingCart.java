package design_patterns.strategy.dicount;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy strategy) {
        this.discountStrategy=strategy;
    }

    double checkout(double totalAmt){
        return totalAmt-discountStrategy.calculateDiscount(totalAmt);
    }
}
