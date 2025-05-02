package collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

  public static void main(String[] args) {
    List<String> list = new CopyOnWriteArrayList<>();
    list.add("Apple");
    list.add("Banana");
    for(String  fruit: list){
      list.add("Cherry");
      System.out.println(fruit);
    }

    System.out.println("Final list: "+list);
  }

}
