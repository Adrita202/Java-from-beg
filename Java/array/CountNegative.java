import java.util.Scanner;
public class CountNegative {
    public static void main(String[] args)
    {
        int n,i,count=0;
        Scanner obj_s=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=obj_s.nextInt();
        int arr[]=new int[10];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            System.out.print("Element"+(i+1)+":");
            arr[i]=obj_s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        System.out.println("Number of negative elements:"+count);
    }  
}
