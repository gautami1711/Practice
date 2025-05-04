package collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningByExample {

  public static void main(String[] args) {
    Map<Boolean, List<Integer>> partitioned= Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.partitioningBy(n->n%2==0));

    System.out.println("Even Numbers: "+partitioned.get(true));
    System.out.println("Odd Numbers: "+partitioned.get(false));
  }

}
