import java.util.Scanner;
public class OddEvenCount {
public static void main(String[] args){
    Scanner obj_s= new Scanner(System.in);
    int i,n,odd,even;
    System.out.println("Enter the number of elements in the array:");
    n=obj_s.nextInt();
    int arr[]=new int[15];
    System.out.println("enter the array elements:");
    for(i=0;i<n;i++)
    {
        System.out.print("Element "+(i+1)+":");
        arr[i]=obj_s.nextInt();
    }
    even=odd=0;
    for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("number of even elements: "+even);
    System.out.println("number of odd elements "+odd);
}
}
