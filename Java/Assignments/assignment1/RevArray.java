class Main {
    public static void main(String[] args) {
        char[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("Original Array:");
        printArray(charArray);
        System.out.println("\nReversed Array:");
        reverseArray(charArray);
        printArray(charArray);
    }
    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverseArray(char[] arr) 
    { 
        int n=arr.length;
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++)
        { 
            b[j - 1] = arr[i]; 
            j = j - 1; 
        } 
}
}
