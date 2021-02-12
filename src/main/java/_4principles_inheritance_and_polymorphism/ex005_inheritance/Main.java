package _4principles_inheritance_and_polymorphism.ex005_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        // Casting an instance of the DerivedClass
        // class to the base type BaseClass.
        BaseClass newInstance = (BaseClass) instance; // Upcast

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

//        System.out.println(newInstance.field4);
//        System.out.println(newInstance.field5);

        // check.
        System.out.println("instance Id:     " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}
