package _5abstract_classes_and_interfaces.abstraction.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {

//     public void simpleMethod() {
//         System.out.println("ConcreteDerivedClass.simpleMethod");
//     }

    @Override
    public void abstractMethod() {
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
