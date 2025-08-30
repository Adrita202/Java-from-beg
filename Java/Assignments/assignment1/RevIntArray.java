public class RevIntArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = 2 * i;
        }
        System.out.println("Original Array:");
        printArray(array);
        reverseArray(array);
        System.out.println("\nReversed Array:");
        printArray(array);
    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move indices towards the center
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
