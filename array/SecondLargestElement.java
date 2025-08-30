import java.util.Scanner;
public class SecondLargestElement {
public static void main(String[] args){
    Scanner obj_s= new Scanner(System.in);
    int i,n,max1,max2;
    System.out.println("Enter the number of elements in the array:");
    n=obj_s.nextInt();
    int arr[]=new int[15];
    System.out.println("enter the array elements:");
    for(i=0;i<n;i++)
    {
        System.out.print("Element "+(i+1)+":");
        arr[i]=obj_s.nextInt();
    }
    max1=max2=arr[0];
    for(i=0;i<n;i++){
        if(arr[i]>max1)
        {
            max2=max1;
            max1=arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1)
        {
            max2=arr[i];
        }
    }
    System.out.println("2nd largest:"+max2);
}
}

