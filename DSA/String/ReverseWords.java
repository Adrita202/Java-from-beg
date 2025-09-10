// https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the      sky is  blue"));
        System.out.println(reverseWords2("the      sky is  blue"));
    }
    static String reverseWords(String s){
        String[] words=s.split(" +");
        StringBuilder builder=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            builder.append(words[i]);
            builder.append(" ");
        }
        return builder.toString().trim();
    }
    static String reverseWords2(String s){
        s=s.trim();
        String[] words=s.split("\\s+");
        StringBuilder builder=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            builder.append(words[i]);
            if (i > 0) builder.append(" ");
        }
        return builder.toString();
    }
}
