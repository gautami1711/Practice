package collection;

import java.util.stream.IntStream;

public class ParallelStreamExample {

  public static void main(String[] args) {
    int sum= IntStream.range(1,1000).parallel().sum();
    System.out.println("Sum using parallel stream: "+sum);
  }

}
