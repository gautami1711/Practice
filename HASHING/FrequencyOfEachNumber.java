package HASHING;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfEachNumber {
    public static void main(String[] args) {
        int []a={0, 5, 5, 5, 4,4,0};
        int n=7;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<7;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else
                map.put(a[i],1);
        }

        Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();
       while (it.hasNext()){
           Map.Entry<Integer,Integer> entry=it.next();
           int key=entry.getKey();
           int val=entry.getValue();
           System.out.println("Frequency of "+key+" = "+val );
       }
    }
}
