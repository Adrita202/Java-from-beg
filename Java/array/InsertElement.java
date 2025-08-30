import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        int i,n,ele,pos;
        Scanner obj_s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n=obj_s.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements:");
        for( i = 0; i < n ; i++)
        {
            arr[i] = obj_s.nextInt();
        }
        System.out.print("enter element to insert:");
        ele=obj_s.nextInt();
        System.out.print("enter position:");
        pos=obj_s.nextInt();
        if(pos>n+1 || pos<=0)
        {
            System.out.println("Invalid Position!");
        }
        else{
            for(i=n;i>=pos;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[pos-1]=ele;
            n++;

        }
        System.out.println("Array elements after insertion:");
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
