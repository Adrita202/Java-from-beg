public class StringBufferDemo{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Meow");
        System.out.println(sb.capacity());
        sb.append(" Reddy");
        System.out.println(sb);

    }

}
