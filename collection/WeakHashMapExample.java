package collection;

import java.util.WeakHashMap;

public class WeakHashMapExample {

  public static void main(String[] args) {
    WeakHashMap<String,String> map=new WeakHashMap<>();
    String key= new String("Temp");
    map.put(key,"data");
    System.out.println("Before GC: "+map);
    key=null;
    System.gc();
    System.out.println("WeekHashMap after GC: "+map);
  }

}
