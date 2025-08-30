// public class CheckLeapYear {
//     public static void main(String[] args) {
//         int year=2100;
//         if(year%4==0){
//             if(year%100==0){
//                 if(year%400==0)
//                     System.out.println("Leapyear");
//                 else
//                     System.out.println("Not Leapyear");
//             }
//             else
//                 System.out.println("Leapyear");
            
//         }
//         else{
//             System.out.println("Not leapyear");
//         }
//     }
// }
    

class CheckLeapYear{
    public static void main(String[] args) {
        int year=2026;
        if((year%400==0)||(year%4==0 && year%100!=0))
            System.out.println("Leapyear");
        else
            System.out.println("Not leapyear");
    }
}