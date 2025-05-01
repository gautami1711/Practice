package OOPs.nested_and_inner_class;

import design_patterns.decorator.car.Car;

public class Test {
    public static void main(String[] args) {
        //testing inner and nested classes
        InnerAndNestedClassExample outer= new InnerAndNestedClassExample();
        InnerAndNestedClassExample.Inner inner=outer.new Inner();
        inner.display();

        InnerAndNestedClassExample.Nested nested= new InnerAndNestedClassExample.Nested();
        nested.display();


        //cart item
        Cart cart=new Cart();
        cart.addItem("Laptop",12345);
        cart.addItem("Phone",499.55);
        cart.displayCart();
    }
}
