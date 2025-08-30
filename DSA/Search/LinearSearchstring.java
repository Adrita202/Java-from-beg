
public class LinearSearchstring {
    public static void main(String[] args) {
        String name="minimalhotra";
        // char key=""
        System.out.println(search2(name,'a'));
        // System.out.println(Arrays.toString(name.toCharArray()));
    }
    // static boolean search(String str,char key){
    //     if(str.length()==0){
    //         return false;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         if(key==str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;

    // }
    static boolean search2(String str,char key){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==key){
                return true;
            }
        }
        return false;

    }
}
