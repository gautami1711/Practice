package collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

  public static void main(String[] args) {
    List<List<String>> nestedList= Arrays.asList(
        Arrays.asList("Apple","Banana"),
        Arrays.asList("Cheery","Date")
    );

    List<String> flatList=nestedList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());

    System.out.println(flatList);

  }

}
