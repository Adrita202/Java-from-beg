import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int i, n, key;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        key = sc.nextInt();
        binarySearch(arr, n, key);
    }

    static void binarySearch(int arr[], int n, int key) {
        int s = 0, e = n - 1, mid;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == key) {
                System.out.println("element found at index: " + mid);
                break;
            }

            else if (arr[mid] < key)
                s = mid + 1;
            else
                e = mid - 1;
        }
        if (s > e) {
            System.out.println("element not found");
        }
    }
}
