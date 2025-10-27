public class CountCharacters {
    public static void main(String[] args) {
        System.out.println(countChar(""));
    }
    static int countChar(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        return count;

    }
}
