import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1="keep";
        String s2="peok";
        if(isAnagram(s1,s2)){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagram");
        }
        
    }
    static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            return true;
        return false;

    }
}
