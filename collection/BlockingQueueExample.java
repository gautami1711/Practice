package collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

  public static void main(String[] args) {
    BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);

    //Producer Thread
    new Thread(()->{
      try {
        for(int i=1;i<=5;i++){
          queue.put(i);
          System.out.println("Produced: "+i);
        }
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }).start();

    //Consumer Thread
    new Thread(()->{
      try {
        for(int i=1;i<=5;i++){
          System.out.println("Consumed: "+queue.take());
        }
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }).start();

  }

}
