// package methods;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        // System.out.println(rev("helppp"));
        System.out.println(checkkk("abcd","dcbb"));


    }
    public static String rev(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            res=str.charAt(i)+res;
        }
        return res;
    }
    private static boolean checkkk(String str1, String str2){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str2.length();i++){
            char c=str2.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            else{
                return false;
            }
        }
        for(char c: map.keySet()){
            if(map.get(c)!=0){
                return false;
            }
        }
        return true;
    }

}
