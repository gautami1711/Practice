package multi_threading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

  public static void main(String[] args) {
    CompletableFuture<String> future= CompletableFuture.supplyAsync(()->{
      return "Pizza is ready";
    });

    future.thenAccept(result->{
      System.out.println(result);
    });
  }

}
