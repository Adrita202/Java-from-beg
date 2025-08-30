// public class GreaterAmongThree {
//     public static void main(String[] args) {
//         int a=10,b=15,c=20;
//         if(a>b && a>c)
//             System.out.println("a is greater");
//         else if (b>a && b>c){
//             System.out.println("b is greater");
//         }
//         else
//             System.out.println("C is greater");

//     }
    
// }
public class GreaterAmongThree{
    public static void main(String[] args) {
        int a=10,b=20,c=5;
        if(a>b){
            if(a>c)
                System.out.println("A is largest");
            else
                System.out.println("C is largest");
        }
        else if(b>c)
            System.out.println("b is largest");
        else
            System.out.println("C is largest");

    }
}