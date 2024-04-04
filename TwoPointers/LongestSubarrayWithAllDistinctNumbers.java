package TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithAllDistinctNumbers {
    public static void main(String[] args) {
        int []a={3,2, 4, 5, 2, 6, 7, 8, 9, 10};

        int length=0;
        int i=0,j=0;
        int n=a.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        while (i<n&&j<n){
            if(!map.containsKey(a[j])){
                map.put(a[j],j);
                int currLen=j-i+1;
                length= Math.max(currLen,length);
                j++;
            }else {
                int currPos=map.get(a[j]);
                while (i<=currPos){map.remove(a[i]);
                    i++;}
                i=currPos+1;
                map.put(a[j],j);
                j++;
            }
        }
        System.out.println(length);
    }
}
