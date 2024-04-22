class MyException extends Exception{
    public MyException(String string){
        super(string);
    }
}     
public class CustomExceptionDemo {
    public static void main(String[] args) {
        int i=23;
        int j=0;
        try {
            j=18/i;
            if(j==0)
                throw new MyException("I wont print 0!!!");
        }
        catch(MyException e){
            j=18/1;
            System.out.println("Default output");

        }
        catch(Exception e){
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
    }
    
}
