import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        while(sc.hasNextLine()){
            String s1=sc.nextLine();
            if(!sc.hasNextLine())
                break;
            String s2=sc.nextLine();

            char[] a =s1.replace(" ","").toLowerCase().toCharArray();
            char[] b=s2.replace(" ","").toLowerCase().toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a,b)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }

        }
    }
}
