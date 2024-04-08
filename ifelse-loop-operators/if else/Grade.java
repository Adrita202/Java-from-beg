public class Grade 
{
    public static void main(String[] args)
    {
        int marks=78;
        if(marks>=80 && marks<=100)
        {
            System.out.println("A");   
        }
        else if(marks>=60 && marks<=79)
        {
            System.out.println("B");
        }
        else if(marks>=40 && marks <=69)
        {
            System.out.println("C");
        }
        else if(marks>=20 && marks <=39)
        {
            System.out.println("D");
        }
        else if(marks<20)
        {
            System.out.println("FAIL");
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}
