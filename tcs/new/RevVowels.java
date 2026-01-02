
// import javax.swing.text.html.HTMLDocument;

// package new;

public class RevVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        
    }
    public static String reverseVowels(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<j){
            if(!isVowel(arr[i]))
                i++;
            else if(!isVowel(arr[j]))
                j--;
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return new String(arr);
    }
    static boolean isVowel(char ch){
        return ch=='a'||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U';
    }

}
