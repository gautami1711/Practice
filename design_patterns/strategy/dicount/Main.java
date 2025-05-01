package design_patterns.strategy.dicount;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart= new ShoppingCart(new PercentageDiscount());
        System.out.println("Final amount: "+cart.checkout(500));

        cart=new ShoppingCart(new FlatDiscount());
        System.out.println("Final amount: "+cart.checkout(1000));
    }
}
