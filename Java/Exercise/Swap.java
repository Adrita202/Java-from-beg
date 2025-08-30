//Using third variable
// public class Swap {
//     public static void main(String[] args) {
//         int a=20, b=1;
//         int temp;
//         temp=a;
//         a=b;
//         b=temp;
//         System.out.println("a="+a+" "+"b="+b);
//     }
    
//  }
// without using 3rd var
public class Swap {
    public static void main(String[] args) {
        int a=20, b=1;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" "+"b="+b);

    }
}