import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("Peek","keep"));
        
    }
    static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ch1=s1.toLowerCase().toCharArray();
        char[] ch2=s2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;

    }
    static boolean isAnagram2(String s,String t){
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            count[ch-'a']--;
        }
        // boolean allZeros=Arrays.stream(count).allMatch(element->element==0);

        // return allZeros;
        for (int value : count) {
        if (value != 0) {
            return false; 
        }
    }

    return true;
    }

}
