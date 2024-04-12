public class TryCatchExp2 {
    public static void main(String[] args) {
        //int i=0;
        int i=2;
        int j=2;
        int arr[]=new int[5];
        String str =null;
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(arr[1]);
        //    System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array limit exceed");

        }
        catch(Exception e){
            System.out.println("wrong" + e);
        }
        
        System.out.println(j);
        System.out.println("Done");


    }
}