//using enhanced fro loop
public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr={1,8,33,7,-2,79,303,465,70};
        // int ans=search(arr,45);
        // if(ans==-888888){
        //     System.out.println("element not found");
        // }
        // else{
        //     System.out.println("element found at index"+ans);
        // }
        boolean ans=search2(arr,79);
        if(ans==false){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found ");
        }

    }
    // static int search(int[] arr,int key){
    //     if(arr.length==0){
    //         return -888888;
    //     }
    //     int index=0;//manual counter
    //     for(int num:arr){
    //         if (num==key){
    //             return index;
    //         }
    //         index++;
    //     }
    //     return -888888;
    // }
    static boolean search2(int[] arr,int key){
        if(arr.length==0){
            return false;
        }
        for(int num:arr){
            if(num==key){
                return true;
            }
        }
        return false;
    }

}
