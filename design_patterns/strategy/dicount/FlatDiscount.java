package design_patterns.strategy.dicount;

public class FlatDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double totalAmt) {
        return totalAmt-50;
    }
}
