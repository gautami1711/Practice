package multi_threading.countdown_latch;

import java.util.concurrent.CountDownLatch;

public class Test {

  public static void main(String[] args) throws InterruptedException {
    int numberOfWorkers=3;
    CountDownLatch latch=new CountDownLatch(numberOfWorkers);
    for (int i=1;i<=numberOfWorkers;i++){
      new Thread(new Worker(latch),"Worker-"+i).start();
    }

    latch.await();
    System.out.println("All workers have finished. Main Thread resuming");

  }

}

