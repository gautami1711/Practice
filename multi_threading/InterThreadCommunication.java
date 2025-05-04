package multi_threading;

public class InterThreadCommunication {
  private boolean isProduced=false;

  public synchronized void produced()throws InterruptedException{
    while (isProduced){
      wait();
    }
    System.out.println("Producing Item");
    isProduced=true;
    notify();
  }

  public synchronized void consume()throws InterruptedException{
    while (!isProduced){
      wait();
    }
    System.out.println("Consuming item");
    isProduced=false;
    notify();
  }

}
