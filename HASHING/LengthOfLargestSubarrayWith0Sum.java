package HASHING;

import java.util.HashMap;

public class LengthOfLargestSubarrayWith0Sum {
    public static void main(String[] args) {
        int []a={15, -2, 2, -8, 1, 7, 10, 23};
        int n=8;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            int currLen=0;
            if(map.containsKey(sum)){
                int lastFound=map.get(sum);
                currLen=i-(lastFound+1)+1;
                if(currLen>maxLen)maxLen=currLen;
            }
            else {
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}
