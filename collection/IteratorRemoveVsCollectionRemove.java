package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveVsCollectionRemove {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("blue");
    list.add("black");
    list.add("green");
    list.add("orange");

    //throws error for if the loop is not finished before detection
    for (String s : list) {
      System.out.println("Currently on: " + s);
      if (s.equalsIgnoreCase("banana")) {
        list.remove(s);
      }
    }
    System.out.println(list);

    //use iterator
    Iterator<String> iterator=list.iterator();
    while (iterator.hasNext()){
      if(iterator.next().equalsIgnoreCase("banana"))iterator.remove();
    }

    System.out.println(list);
  }

}
