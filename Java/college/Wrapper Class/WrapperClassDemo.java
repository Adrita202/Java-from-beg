public class WrapperClassDemo {
    public static void main(String[] args) {
        int num=7;
        Integer num1= num; //Autoboxing
      //  int num2=num1.intValue(); or
      int num2=num1; //auto-unboxing
        
        System.out.println(num2);

        String str="11";
        Integer num3=Integer.parseInt(str);
        System.out.println(num3*2);

    }
}
