package multi_threading.countdown_latch;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{
  private final CountDownLatch latch;

  public Worker(CountDownLatch latch) {
    this.latch = latch;
  }

  @Override
  public void run() {
    try {
      Thread.sleep((long) (Math.random()*1000));
      System.out.println(Thread.currentThread().getName()+" finished work");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }finally {
      latch.countDown();
    }
  }
}
