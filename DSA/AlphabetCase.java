import java.util.*;
public class AlphabetCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         // System.out.println(sc.next().trim());
        char ch=sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
       System.out.println(ch);
    }
    
}
