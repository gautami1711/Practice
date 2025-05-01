package design_patterns.strategy.dicount;

public class PercentageDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double totalAmt) {
        return totalAmt*0.1;//10% discount
    }
}
