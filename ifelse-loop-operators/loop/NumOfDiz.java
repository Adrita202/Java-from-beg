public class NumOfDiz 
{
    public static void main(String[] args)
    {
        int count=0;
        int num=1234564;
        do
        {
            count++;
            num/=10;
        }
        while(num!=0);
        System.out.println("Total dizits: "+count);

    }
}
