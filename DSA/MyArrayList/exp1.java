import java.util.ArrayList;
import java.util.Scanner;
public class exp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10); 

        // list.add(67);
        // list.add(5);
        // list.add(1001);
        // list.add(45);
        // list.add(67);
        // list.add(5);
        // list.add(1001);
        // list.add(45);
        // list.add(67);
        // list.add(5);
        // list.add(1001);
        // list.add(45);
        // list.add(67);
        // list.add(5);
        // list.add(1001);
        // list.add(45);
        
        // System.out.println(list);

        // System.out.println(list.contains(101));
        // list.set(0,11);
        // System.out.println(list);
        
        // list.remove(0);
        // System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        //get item of any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(3)+" ");
        }
    sc.close();
    }
    
    
}
