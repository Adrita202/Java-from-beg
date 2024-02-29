import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner obj_s= new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the number of elements in the array:");
        n=obj_s.nextInt();
        int arr[]=new int[15];
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            System.out.print("Element "+(i+1)+":");
            arr[i]=obj_s.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of the elements:"+sum);


    }
    
}
