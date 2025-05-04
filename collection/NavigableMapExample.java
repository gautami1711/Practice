package collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

  public static void main(String[] args) {
    NavigableMap<Integer,String> map=new TreeMap<>();
    map.put(1,"One");
    map.put(2,"Two");
    map.put(3,"Three");
    map.put(5,"Five");

    System.out.println("Lower key for 4: "+map.lowerKey(4));
    System.out.println("Ceiling KEy for 4: "+map.ceilingKey(4));
  }

}
