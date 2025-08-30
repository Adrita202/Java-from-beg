
import java.util.Scanner;
public class LinearSearch {
    
    public static void main(String[] args) {
        int n,i,key;
        boolean flag;
        Scanner obj_s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n=obj_s.nextInt();
        int[] arr = new int[10];
       
        System.out.println("Enter the elements:");
        for( i = 0; i < n ; i++)
        {
            System.out.print("Element"+(i+1)+":");
            arr[i]=obj_s.nextInt();
        }
        System.out.println("Enter element to search: ");
        key=obj_s.nextInt();
        flag=false;
        for(i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                flag= true;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("Found at position: "+(i+1));
        }
        else{
            System.out.println("Not found");
        }
    }
}