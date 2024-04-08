public class LargestNum
{
    public static void main(String[] args)
    {
        int num1=12;
        int num2=56;
        int num3=10;
        int max=1;
        if((num1>num2)&&(num1>num3))
        {
                 max=num1;
        }
        else if((num2>num1)&&(num2>num3))
        {
            max=num2;
        }
        else if((num3>num1)&&(num3>num2))
        {
            max=num3;
        }
        System.out.println("The maximum number is:"+max);
        }
    }

