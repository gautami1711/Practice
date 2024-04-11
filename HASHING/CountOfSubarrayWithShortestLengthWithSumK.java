package HASHING;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubarrayWithShortestLengthWithSumK {
    public static void main(String[] args) {
        int []a={1,2,1,6,2,1,7};
        int k=1;
        int i=0,j=0;
        int prefixSum=0;
        int count=0;
        int currLeastLength=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        while (j<a.length){
            prefixSum+=a[j];
            if(prefixSum==k){
                int len=j-i+1;
                if(len==currLeastLength) {
                    count++;
                }else if(len<currLeastLength) {
                    count=1;
                    currLeastLength = len;
                }
            }else if(map.containsKey(Math.abs(prefixSum-k))){
                int len=j-map.get(Math.abs(prefixSum-k));
                if(len==currLeastLength){
                    count++;
                }else if(len<currLeastLength) {
                    count=1;
                    currLeastLength = len;
                }
            }
            map.put(prefixSum,j);

            j++;
        }
        System.out.println(count);
    }
}
