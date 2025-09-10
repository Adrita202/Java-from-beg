public class StringBuilderExp {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());
        System.out.println(builder.append("adrita"));
        System.out.println(builder.append(false));
        System.out.println(builder.append("meowwwwwww", 0, 5));
        System.out.println(builder.capacity());//70
        System.out.println(builder.hashCode());
        System.out.println(builder.charAt(5));
        System.out.println(builder.delete(0, 26));

    }
    
}
