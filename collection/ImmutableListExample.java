package collection;

import java.util.Collections;
import java.util.List;

public class ImmutableListExample {

  public static void main(String[] args) {
    List<String> immutableList= Collections.unmodifiableList(List.of("Apple","Banana"));
    System.out.println(immutableList);
//    immutableList.add("cherry");

  }

}
