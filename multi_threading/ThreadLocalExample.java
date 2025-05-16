package multi_threading;

public class ThreadLocalExample {
  private static final ThreadLocal<Integer> threadLocal=ThreadLocal.withInitial(()->1);

  public static void main(String[] args) {
    Thread t1=new Thread(()->{
      System.out.println("Thread 1 initial value: "+threadLocal.get());
      threadLocal.set(100);
      System.out.println("Thread 1 updated value: "+threadLocal.get());
    });

    Thread t2=new Thread(()-> System.out.println("Thread 2 value: "+threadLocal.get()));
    t1.start();
    t2.start();
  }

}
