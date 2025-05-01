package OOPs.nested_and_inner_class;

public class InnerAndNestedClassExample {
    private int val=10;

    class Inner{
        public void display(){
            System.out.println("Value: "+val);
        }
    }

    static class Nested{
        public void display(){
            System.out.println("val is not accessible here");
        }
    }
}
