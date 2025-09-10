public class Comparison {
    public static void main(String[] args) {
        // == method (camparator)
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);   //true
        //checks for both the values and reference variable ,if reference variable is pointing to the same object.
        //true if pointing to the same, else false

        String s3=s1;
        System.out.println(s1==s3);//true

        //create diff object of same value outside the pool
        String a =new String("Kullu");
        String b= new String("Kullu");
        System.out.println(a==b); //false

        //when only to check values, use .equals().... cares only about the values
        System.out.println(a.equals(b));

        System.out.println(a.charAt(1));
    }
}
