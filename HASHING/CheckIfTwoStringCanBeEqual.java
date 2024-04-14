package HASHING;

import java.util.HashMap;

public class CheckIfTwoStringCanBeEqual {
    public static boolean checkEqual(String a,String b){

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        HashMap<Character,Integer> map3=new HashMap<>();
        HashMap<Character,Integer> map4=new HashMap<>();

        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(i%2==0){
                map1.put(c,map1.getOrDefault(c,0)+1);
            }else {
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
        }

        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(i%2==0){
                map3.put(c,map3.getOrDefault(c,0)+1);
            }else {
                map4.put(c,map4.getOrDefault(c,0)+1);
            }
        }

        return map1.equals(map3)&&map2.equals(map4);

    }

    public static void main(String[] args) {
        String a="cdab";
        String b="abcd";

        System.out.println(checkEqual(a,b));
    }
}
