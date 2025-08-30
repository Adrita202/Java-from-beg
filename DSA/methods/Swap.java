
public class Swap {
     public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // This won't actually swap 'a' and 'b' — Java is pass-by-value
        // swap(a, b);

        // System.out.println(a); // Still prints 10, not 20
        // System.out.println(b); // Still prints 20

        //  use an array to allow changes to persist
        int[] values = {a, b}; // wrap a and b inside an array
        swap(values); // swap inside the array
        System.out.println("a = " + values[0]); // now prints 20
        System.out.println("b = " + values[1]); // now prints 10
    }

    // ❌ This method won't actually swap original 'a' and 'b'
    // because x and y are just copies (pass-by-value)
    // static void swap(int x, int y) {
    //     int temp = x;
    //     x = y;
    //     y = temp;
    // }

    //  swaps values in the array (pass-by-reference-like)
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
