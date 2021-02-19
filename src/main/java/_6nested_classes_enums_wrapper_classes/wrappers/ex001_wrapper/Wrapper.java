package _6nested_classes_enums_wrapper_classes.wrappers.ex001_wrapper;

//Autoboxing and Unboxing
public class Wrapper {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;

        float f = 50.0F;
        double d = 60.0D;

        char c = 'a';

        boolean bool = true;

//Autoboxing: Converting primitives into objects
        Byte byteObject = b;
        Short shortObject = s;
        Integer intObject = i;
        Long longObject = l;

        Float floatObject = f;
        Double doubleObject = d;

        Character charObject = c;

        Boolean booleanObject = bool;

//Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteObject);
        System.out.println("Short object: " + shortObject);
        System.out.println("Integer object: " + intObject);
        System.out.println("Long object: " + longObject);
        System.out.println("Float object: " + floatObject);
        System.out.println("Double object: " + doubleObject);
        System.out.println("Character object: " + charObject);
        System.out.println("Boolean object: " + booleanObject);

//Unboxing: Converting Objects to Primitives
        byte byteValue = byteObject;
        short shortValue = shortObject;
        int intValue = intObject;
        long longValue = longObject;
        float floatValue = floatObject;
        double doubleValue = doubleObject;
        char charValue = charObject;
        boolean booleanValue = booleanObject;

//Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + booleanValue);
    }
}

