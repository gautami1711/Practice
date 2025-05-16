package multi_threading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
  private final Semaphore semaphore=new Semaphore(3);
  public void accessResource(){
    try {
      semaphore.acquire();
      System.out.println(Thread.currentThread().getName()+" accesses the resource");
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }finally {
      semaphore.release();
    }
  }

  public static void main(String[] args) {
    SemaphoreExample example=new SemaphoreExample();
    for(int i=0;i<5;i++){
      new Thread(example::accessResource).start();
    }
  }
}


