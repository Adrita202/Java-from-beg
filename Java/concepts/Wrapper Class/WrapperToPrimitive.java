public class WrapperToPrimitive {
    public static void main(String[] args) {
        // Wrapper class objects
        Integer intWrapper = Integer.valueOf(10);
        Double doubleWrapper = Double.valueOf(10.5);
        Character charWrapper = Character.valueOf('A');
        Boolean boolWrapper = Boolean.valueOf(true);

        // Unboxing: Automatically converts wrapper objects to primitive types
        int intPrimitive = intWrapper;
        double doublePrimitive = doubleWrapper;
        char charPrimitive = charWrapper;
        boolean boolPrimitive = boolWrapper;

        // Printing primitive types
        System.out.println("Integer Primitive: " + intPrimitive);
        System.out.println("Double Primitive: " + doublePrimitive);
        System.out.println("Character Primitive: " + charPrimitive);
        System.out.println("Boolean Primitive: " + boolPrimitive);
    }
}
