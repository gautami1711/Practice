package HASHING;

import java.util.HashMap;

public class MaximumDistanceBetweenTwoOcc {
    public static void main(String[] args) {
        int []a={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int n=12;
        int maxDist=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int currDiff=0;
            if(map.containsKey(a[i])){
                currDiff=i-map.get(a[i]);
                if(currDiff>maxDist)maxDist=currDiff;
            }else{
                map.put(a[i],1);
            }
        }
        System.out.println(maxDist);
    }
}
