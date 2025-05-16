package multi_threading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityExample {

  public static void main(String[] args) {
    AtomicInteger count=new AtomicInteger(0);
    count.incrementAndGet();
    System.out.println(count);
  }

}
