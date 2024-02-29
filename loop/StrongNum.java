public class StrongNum 
{
    public static void main(String[] args)
    {
        int num=145;
        int temp=num;
        int sum=0;
        int fact=1;
        while(num>0)
        {
            int lastdigit=num%10;
            for(int i=1;i<=lastdigit;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==temp)
        {
            System.out.println("It is a strong number.");

        }
        else
        {
            System.out.println("Not strong number");
        }
    }
    
}
