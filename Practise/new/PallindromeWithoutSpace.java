public class PallindromeWithoutSpace {
    public static void main(String[] args) {
        String str="madam";

        int left=0;
        int right=str.length()-1;
        boolean isPallindrome=true;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPallindrome=false;
                break;
            }
            left++;
            right++;

        }

        if(isPallindrome){
            System.out.println("pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
