package collection.custom_iterable;

public class Test {

  public static void main(String[] args) {
    CustomIterable collection= new CustomIterable();
    for (String element:collection){
      System.out.println(element);
    }
  }

}
