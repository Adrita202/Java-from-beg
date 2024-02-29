import java.util.Scanner;
public class CopyElements {
    public static void main(String[] args) {
        int n,i;
        Scanner obj_s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n=obj_s.nextInt();
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        System.out.println("Enter the elements:");
        for( i = 0; i < n ; i++)
        {
            System.out.print("Element"+(i+1)+":");
            arr[i]=obj_s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            arr2[i]=arr[i];
        }
        System.out.println("New array:");
        for( i=0;i<n;i++)
        {
            System.out.println(arr2[i]);
        }


    }
    
}
