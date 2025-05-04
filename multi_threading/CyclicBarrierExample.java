package multi_threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
  private static final int THREADS=3;

  //Declare barrier as a static field ,so it's accessible inside the inner class
  private static final CyclicBarrier barrier=new CyclicBarrier(THREADS,()->{
    System.out.println("All threads reached the barrier. Proceeding...\n");
  });

  public static void main(String[] args) {
      for(int i=0;i<THREADS;i++){
        new Thread(new Task(),"Thread-"+i).start();
      }
  }

  static class Task implements Runnable{

    @Override
    public void run() {
      try {
        System.out.println(Thread.currentThread().getName()+" performing task part 1");
        Thread.sleep((long) (Math.random()*1000));

        //wait at the barrier
        barrier.await();

        System.out.println(Thread.currentThread().getName()+" performing Task pat 2");
        Thread.sleep((long) (Math.random()*1000));

        //wait at the barrier again(barrier is reusable
        barrier.await();

        System.out.println(Thread.currentThread().getName()+" finished the task");


      } catch (InterruptedException | BrokenBarrierException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
