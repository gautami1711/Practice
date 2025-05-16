package multi_threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

  public static void main(String[] args) {
    BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);


    //Producer
    new Thread(()->{
      for(int i=0;i<10;i++){
        try {
          queue.put(i);
          System.out.println("Produced "+i);

        } catch (InterruptedException e) {
          e.printStackTrace();
          throw new RuntimeException(e);
        }
      }
    }).start();

    //consumer
    new Thread(()->{
      while (true){
        try {
          Integer item=queue.take();
          System.out.println("Consumed: "+item);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }).start();
  }

}
