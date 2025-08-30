public class PrimeNumber {
 
    public static void main(String[] args) {
        int f,i,j;
        for(i=101;i<=199;i+=2)
        {
            f=1;
            for(j=3;j<i;j++){
                if(i%j==0){
                    f=0;
                    break;
                }
            }
            if(f==1){
                System.out.println(i);
                f=1;
            }
 
        }
    }
 
}