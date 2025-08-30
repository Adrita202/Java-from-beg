import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, n;
    System.out.println("Enter number of elements in the array: ");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int j, temp;
    for (i = 0; i < n - 1; i++) 
    {
      for (j = 0; j < n - 1 - i; j++) 
      {
        if (arr[j] > arr[j + 1]) 
        {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("The sorted array is: ");
    for (i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
