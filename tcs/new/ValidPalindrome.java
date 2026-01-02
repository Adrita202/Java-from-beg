public class ValidPalindrome {
    public static void main(String[] args) {
        
    }
    public boolean isPalindrome(String s){
        String cleaned="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                cleaned+=Character.toLowerCase(ch);
            }
        }
        String rev="";
        for(int i=cleaned.length()-1;i>=0;i--){
            rev+=cleaned.charAt(i);
        }
        return cleaned.equals(rev);

    }
    public boolean ispalindrome2(String s){
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
