package multi_threading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteExample {
  private int data=0;
  private final ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

  public void write(int value){
    lock.writeLock().lock();
    try {
      data=value;
      System.out.println("Data written: "+data);
    }finally {
      lock.writeLock().unlock();
    }
  }

  public int read(){
    lock.readLock().lock();
    try {
      System.out.println("Data read: "+data);
      return data;
    }finally {
      lock.readLock().unlock();
    }
  }

}
