package _4principles_inheritance_and_polymorphism.ex002_inheritance;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        System.out.println(instance.publicField);
        instance.show();
    }

}
