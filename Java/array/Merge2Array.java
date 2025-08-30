import java.util.Scanner;
public class Merge2Array {
    
    public static void main(String[] args) {
        int n1,n2,i,j;
        Scanner obj_s=new Scanner(System.in);
        int arr[] = new int[10];
        int arr2[] = new int[10];
        int arr3[]=new int[20];
        System.out.println("Enter the size of the 1st the array : ");
        n1=obj_s.nextInt();
        System.out.println("Enter the elements of 1st array:");
        for(i=0;i<n1;i++)
        {
            System.out.print("Element"+(i+1)+":");
            arr[i]=obj_s.nextInt();
        }
        System.out.println("Enter the size of the 2nd the array : ");
        n2=obj_s.nextInt();
        System.out.println("Enter the elements of 2nd array:");
        for(i=0;i<n2;i++)
        {
            System.out.print("Element"+(i+1)+":");
            arr2[i]=obj_s.nextInt();
        }
        
        for(i=0;i<n1;i++)
        {
            arr3[i]=arr[i];
         }
     	for(j=0;j<n2;j++,i++)
        {
            arr3[i]=arr2[j];
        }
        System.out.println("The final array is:");
        for(i=0;i<n1+n2;i++)
        {
            System.out.println(arr3[i]);
        }
}
}