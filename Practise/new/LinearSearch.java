import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key to find");
        int key=sc.nextInt();
        int index=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("element found at index "+index);
        }else{
            System.out.println("element not found");
        }

        // for(int i:arr){
        //     System.out.print(i);
        // }
    }
}
