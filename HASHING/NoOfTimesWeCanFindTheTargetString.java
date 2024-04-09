package HASHING;

import java.util.HashMap;
import java.util.Map;

public class NoOfTimesWeCanFindTheTargetString {
    public static int count(String s, String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        int result=Integer.MAX_VALUE;
        for (int i=0;i<t.length();i++){
            Character c=t.charAt(i);
            if(!map.containsKey(c))return 0;
            int currCnt=map.get(c);
            result= Math.min(currCnt,result);
        }
        return result;
    }
    public static void main(String[] args) {
        String s="abacbc";
        String t="bca";
        System.out.println(count(s,t));
    }
}
