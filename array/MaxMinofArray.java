
import java.util.Scanner;
public class MaxMinofArray {
    public static void main(String[] args){
        Scanner obj_s= new Scanner(System.in);
        int i,n,max,min;
        System.out.println("Enter the number of elements in the array:");
        n=obj_s.nextInt();
        int arr[]=new int[15];
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            System.out.print("Element "+(i+1)+":");
            arr[i]=obj_s.nextInt();
        }
        max=min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum element:"+max);
        System.out.println("Minimum element:"+min);

    }
}