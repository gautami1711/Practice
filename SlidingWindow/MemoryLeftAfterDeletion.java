package SlidingWindow;

import java.util.ArrayList;

public class MemoryLeftAfterDeletion {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here

        long sum=0;
        long maxsum=0;
        int i=0;
        int j=0;
        int length=0;
        long totalSum=0;
        while(j<N){
            totalSum+=Arr.get(j);
            sum+=Arr.get(j);
            j++;
            length++;
            if(length==K){
                maxsum=Math.max(sum,maxsum);
                sum-=Arr.get(i);
                i++;
                length--;
            }

        }
        return totalSum-maxsum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(4);
        arr.add(8);
        arr.add(13);
        arr.add(20);
        System.out.println(maximumSumSubarray(2,arr,5));
    }
}
