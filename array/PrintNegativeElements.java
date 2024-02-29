import java.util.Scanner;
public class PrintNegativeElements {
    public static void main(String[] args){
        Scanner obj_s=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number of elements in the array:");
        n=obj_s.nextInt();
        int arr[]= new int[10];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=obj_s.nextInt();
        }
        System.out.println("The negative elements are:");
        for(i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                System.out.println(arr[i]);
            }
        }


    }
    
}
