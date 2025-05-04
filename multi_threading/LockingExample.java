package multi_threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingExample {

  private int count=0;
  private final Lock lock=new ReentrantLock();

  public void increment(){
    if (lock.tryLock()){
      try {
        count++;
      }finally {
        lock.unlock();
      }
    }
  }

  public int getCount(){
    return  count;
  }

}
