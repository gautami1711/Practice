package collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.removeIf(n -> n % 2 != 0); // Removes odd numbers
    System.out.println("After removeIf: " + numbers);
  }

}
