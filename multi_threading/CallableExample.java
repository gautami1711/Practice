package multi_threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {

  @Override
  public String call() throws Exception {
    return "Task completed";
  }

  public static void main(String[] args) {
    ExecutorService executor= Executors.newSingleThreadExecutor();
    CallableExample task=new CallableExample();
    Future<String> future = executor.submit(task);
    try {
      String result=future.get();
      System.out.println(result);
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    executor.shutdown();
  }
}

