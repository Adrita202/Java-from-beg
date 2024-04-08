public class ArrayDemo {
    public static void main(String[] args) {
        int num[]={1,2,3,8};
        System.out.println(num[1]);
        num[1]=0;//change value
        System.out.println(num[1]);

        //create array of size 5
        int num2[]=new int[3];//by default all the 5 values will be 0
        num2[0] = 8;
        num2[1] = 45;
        num2[2] = 98;
        for(int i=0;i<3;i++)
        {
            System.out.print(num[i]);
        }
    }
    
}
