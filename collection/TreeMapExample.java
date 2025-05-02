package collection;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapExample {

  public static void main(String[] args) {
    TreeMap<String,Integer> map=new TreeMap<>(Collections.reverseOrder());
    map.put("One",1);
    map.put("Two",2);
    System.out.println("Tree map with custom sorting: "+map);
  }

}
