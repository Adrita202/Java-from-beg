// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1753088415/?source=submission-ac
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={18,9,124,1736,98,1,02};
        System.out.println(findNumbers(nums));
        // System.out.println(digits(-123456789));
        System.out.println(digits2(123456));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }

         return count;
    }
    static boolean even(int n){
        int numberOfDigits=digits(n);
        // if(numberOfDigits%2==0){
        //     return true;
        // }
        // return false;
        return numberOfDigits%2==0;
        
    }
    static int digits(int n){
        if(n<0){
            n=n*-1;
        }
        if(n==0)
            return 1;
        
         int c=0;
        while(n>0){ 
            c++;
            n=n/10;
        }
        return c;
    }
    static int digits2(int n){
        return (int)(Math.log10(n)+1);
    }
}
