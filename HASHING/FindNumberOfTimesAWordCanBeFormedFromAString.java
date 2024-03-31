package HASHING;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfTimesAWordCanBeFormedFromAString {

    //Question link- https://leetcode.com/discuss/interview-question/3114099/AMAZON-OA-(INTERN-2024)
    public static void main(String[] args) {
        String s="mononom";
        String t="mon";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i),1);
        }
        int count=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                System.out.println(0);
                System.exit(0);
            }else {
                int curr=map.get(t.charAt(i));
                count= Math.min(curr,count);
            }
        }
        System.out.println(count);

    }
}
