public class Ispalindrome {
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(palindrome2(str));
        
    }
    static boolean palindrome(String str){
        if(str==null ||str.length()==0) 
            return true;
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
    static boolean palindrome2(String str){
        String rev="";
        if(str==null ||str.length()==0) 
            return true;
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            return true;
        }
        return false;
    }
}
