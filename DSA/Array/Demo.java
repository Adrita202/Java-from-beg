

import java.util.Arrays;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
      
        int [] roll=new int[5];
        //or
        int [] roll2={1,2,3,4,5};

        int [] roll3;
        roll3=new int[10];

        // String[] arr=new String[4];
        // System.out.println(arr[1]);
        Scanner sc=new Scanner(System.in);
        int arr2[]=new int[5];
        // arr2[0]=1;
        // arr2[1]=5;
        // arr2[3]=8;
        // System.out.println(arr2[0]);
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("meow");
        // for(int i=0;i<arr2.length;i++){
        //     System.out.println(arr2[i]);
        // for (int num:arr2){
        //     System.out.println(num+" ");//num represents elements of the array
        
        // }
        System.out.println(Arrays.toString(arr2));

        //odify
    }
    
}
