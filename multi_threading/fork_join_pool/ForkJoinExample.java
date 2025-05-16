package multi_threading.fork_join_pool;

import java.util.Stack;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {

  public static void main(String[] args) {
    int[] arr= new int[100];
    for(int i=0;i<100;i++)arr[i]=i;
    ForkJoinPool pool=new ForkJoinPool();
    int result=pool.invoke(new SumTask(arr,0,arr.length));
    System.out.println("Sum: "+result);

  }

}
