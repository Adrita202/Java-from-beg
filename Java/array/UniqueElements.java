import java.util.Scanner;

public class UniqueElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, n;
    System.out.print("Enter number of elements in the array: ");
    n = sc.nextInt();
    int arr1[] = new int[50];
    int arr2[] = new int[50];
    System.out.println("Enter the elements of the array: ");
    for (i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    unique(arr1, n);
  }

  static void unique(int arr[], int n) {
    int i, j, c;
    // System.out.println("Unique elements: ");
    for (i = 0; i < n; i++) {
      c = 0;
      for (j = 0; j < n; j++) {
        if (arr[i] == arr[j])
          c++;
      }
      if (c == 1) {
        System.out.print(arr[i]);
      }

    }
  }
}