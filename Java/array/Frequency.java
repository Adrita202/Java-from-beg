import java.util.Scanner;
public class Frequency
{ 
    public static void main(String[] args)
   {
      Scanner sc =new Scanner(System.in);
      int i,n;
      System.out.print("Enter number of elements in the array: ");
      n=sc.nextInt();
      int arr1[] = new int [50];
      int arr2[]=new int[50];
      System.out.println("Enter the elements of the array: ");
      for(i=0;i<n;i++)
      {
        arr1[i]=sc.nextInt();
        arr2[i]=-1234;
      }
      frequency(arr1,arr2,n);

      System.out.println("The frequency of all elements of array: ");
      for(i=0;i<n;i++)
      {
        if(arr2[i]!=0)
        {
            System.out.println(arr1[i] + " found "+arr2[i]+" times");
        }
      }
      sc.close();
}
static void frequency(int arr1[],int arr2[],int n)
{
    int i,ctr,j;
    for(i=0;i<n;i++)
    {
        ctr=1;
        for(j=i+1;j<n;j++)
        {
            if(arr1[i]==arr1[j])
            {
                ctr++;
                arr2[j] = 0;
            }
        }
        if(arr2[i]!=0)
        {
            arr2[i] = ctr;
        }
    }
    
}
}
