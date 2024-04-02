package HASHING;

import java.util.HashMap;

public class CountTheNumberOfSpecialPairsInArray {
    public static void main(String[] args) {
        int n=4;
        int [] a={0,4,2,1,2};
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int lhs=a[a[a[i+1]]];
            if(map.containsKey(lhs)){
                count+=map.get(lhs);
                map.put(lhs,map.get(lhs)+1);
            }else {
                map.put(lhs,1);
            }
        }
        System.out.println(count);

    }
}
