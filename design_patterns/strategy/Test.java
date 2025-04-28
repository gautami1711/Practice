package design_patterns.strategy;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart1=new ShoppingCart(new CreditCardPayment());
        cart1.checkout(5000);

        ShoppingCart cart2= new ShoppingCart(new PaypalPayment());
        cart2.checkout(10000);

        //sorting strategy use
        SortingStrategy strategy=new BubbleSort();
        strategy.sort(new int[]{3,5,7,2,});

        strategy=new MergeSort();
        strategy.sort(new int[]{3,5,7,2,});
    }
}
