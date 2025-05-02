package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {

  public static void main(String[] args) {
    List<String> synchronizedList= Collections.synchronizedList(new ArrayList<>());
    synchronizedList.add("Apple");

      for (String s : synchronizedList) {
        System.out.println(s);
      }

  }

}
