import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner obj_s = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number of elements in the array : ");
        n = obj_s.nextInt();

        int[] arr = new int[10];
        System.out.println("Enter the elements:");
        for( i = 0; i < n ; i++)
        {
            arr[i] = obj_s.nextInt();
        }
         System.out.println("The array is:");
        // for(int x : arr)
        // {
        //     System.out.println(x);
        // }
        for( i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
