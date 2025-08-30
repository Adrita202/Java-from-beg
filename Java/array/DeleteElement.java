import java.util.Scanner;
    public class DeleteElement {
    
    public static void main(String[] args) {
        int i,n,pos;
        Scanner obj_s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n=obj_s.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements:");
        for( i = 0; i < n ; i++)
        {
            arr[i] = obj_s.nextInt();
        }
        System.out.print("enter position to delete:");
        pos=obj_s.nextInt();
    
    if(pos<0 || pos>n)
    {
        System.out.println("Invalid Position");

    }
    else
    {
        for(i=pos-1;i<n-1;i++)
        {
            arr[i]=arr[i+1];
            
        }
        n--;
        System.out.println("Elements of array after delete are : ");{
            for(i=0; i<n; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
}

