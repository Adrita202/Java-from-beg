// package DSA.Array;

// import java.lang.reflect.Array;
import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int arr[][] =new int[3][3];
    System.out.println(arr.length); //no of rows
    // System.out.println(arr.length);
    // int arr[][]={
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}
    // };
    //input
    for(int row=0;row< arr.length; row++){
        for(int col=0;col<arr[row].length;col++){
            arr[row][col]=sc.nextInt();
        }

    }
    // for(int row=0;row<arr.length;row++){
    //     for(int col=0;col<arr[row].length;col++){
    //         System.out.print(arr[row][col]+" ");
    //     }
    //     System.out.println();
    // }
    //Arrays.toString method
    // for(int row=0;row<arr.length;row++){
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    //Enhanced for loop
    for(int[] a:arr){
        System.out.println(Arrays.toString(a));
    }


}
}
