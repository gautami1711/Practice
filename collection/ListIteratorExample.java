package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        ListIterator<String> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Forward traversal"+listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println("Backward traversal: "+listIterator.previous());
        }
    }
}
