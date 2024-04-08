public class Pallindrome
{
    public static void main(String[] args)
    {
        int n=121;
        int rev=0;
        int num=n;
        while(n!=0)
        {
            rev=(rev*10)+(n%10);
            n/=10;
        }
        if(rev==num)
        {
            System.out.println("pallindromr number");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    }
    

    
}

