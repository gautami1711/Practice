package OOPs.generics;

public class Test {
    public static void main(String[] args) {
        Box<Integer> integerBox=new Box<>();
        integerBox.setItem(110);
        integerBox.getItem();

    }
}
