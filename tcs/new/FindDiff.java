public class FindDiff {
    public static void main(String[] args) {
        
    }
    public static char diff(String s, String t){
        int total=0;
        for(int i=0;i<t.length();i++){
            total +=t.charAt(i);
        }

        for(int i=0;i<s.length();i++){
            total-=s.charAt(i);
        }

        return (char) total;

    }
}
