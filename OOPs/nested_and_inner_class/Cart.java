package OOPs.nested_and_inner_class;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items=new ArrayList<>();

    public void addItem(String name, double price){
        items.add(new CartItem(name,price));
    }

    public void displayCart(){
        for(CartItem item:items){
            item.displayItem();
        }
    }


    private class CartItem{
        private String name;
        private double price;

        public CartItem(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public void displayItem(){
            System.out.println("Item: "+name+", Price: $"+price);
        }
    }
}
