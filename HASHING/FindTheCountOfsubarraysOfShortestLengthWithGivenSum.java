package HASHING;

import java.util.HashMap;
import java.util.Map;

public class FindTheCountOfsubarraysOfShortestLengthWithGivenSum {
    public static void main(String[] args) {
        int k=15;
        int a[]={10,5,2,7,1,9,8,7,7,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        int minLength=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<a.length;i++){
            prefixSum+=a[i];
            int currLen=0;
            if(prefixSum==k){
                currLen=i-0+1;
                if(currLen<minLength){
                    count++;
                    minLength=currLen;
                }
                map.put(prefixSum,i);
            }else {
                int diff= Math.abs(prefixSum-k);
                if(map.containsKey(diff)){
                   currLen=i-map.get(diff);
                   if(currLen==minLength){
                       count++;
                   }else if(currLen<minLength) {
                       minLength=currLen;
                       count=1;
                   }

                }
                map.put(prefixSum,i);
            }
        }
        System.out.println(count);
    }
}
