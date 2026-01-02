// package new;

public class UniqueChar {
    public static void main(String[] args) {
        System.out.println(firstuniqchar("leetcode"));
        
    }
    static int firstuniqchar(String str){
        int[] freq=new int[26];
        char[] arr=str.toCharArray();
        for(char c:arr){
            freq[c-'a']++;

        }
        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]-'a']==1)
                return i;

        }
        return -1;



    }
}
