public class TryCatchExp{
    public static void main(String[] args) {
        int i=0, j=1;
        try{
            j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("wrong");
        }
        System.out.println(j);
        System.out.println("Done");


    }
}