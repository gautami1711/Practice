package collection;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {

  public static void main(String[] args) {
    Map<String,Integer> map=new HashMap<>();
    map.put("Apple",1);

    map.computeIfAbsent("Banana",k->2);
    System.out.println(map);

    map.computeIfPresent("Banana",(k,v)->3);
    System.out.println(map);
  }

}
