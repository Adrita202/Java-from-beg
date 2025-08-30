public class PrimitiveToWrapper {
    public static void main(String[] args) {
        int intPrimitive = 10;
        double doublePrimitive = 10.5;
        char charPrimitive = 'A';
        boolean boolPrimitive = true;

        Integer intWrapper = intPrimitive;
        Double doubleWrapper = doublePrimitive;
        Character charWrapper = charPrimitive;
        Boolean boolWrapper = boolPrimitive;

        System.out.println("Integer Wrapper: " + intWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Character Wrapper: " + charWrapper);
        System.out.println("Boolean Wrapper: " + boolWrapper);
    }

}
