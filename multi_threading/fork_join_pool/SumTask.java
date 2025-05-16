package multi_threading.fork_join_pool;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {
  private final int[] arr;
  private final int start;
  private final int end;

  public SumTask(int[] arr, int start, int end) {
    this.arr = arr;
    this.start = start;
    this.end = end;
  }

  @Override
  protected Integer compute() {
    if(end-start<=10){
      int sum=0;
      for(int i=start;i<end;i++)sum+=arr[i];
      return sum;
    }else {
      int mid=(start+end)/2;
      SumTask leftTask=new SumTask(arr,start,mid);
      SumTask rightTask=new SumTask(arr,mid,end);
      leftTask.fork();
      return rightTask.compute()+leftTask.join();
    }
  }
}
