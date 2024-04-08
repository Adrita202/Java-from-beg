public class SumOfDiz
{
    public static void main(String[] args)
    {
        int num=12345;
        int sum=0;
        for(int i=1;i>0;i++)
        {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("Sum of digits:"+sum);
    }

}
