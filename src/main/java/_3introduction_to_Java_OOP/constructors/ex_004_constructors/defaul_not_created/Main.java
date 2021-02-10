package _3introduction_to_Java_OOP.constructors.ex_004_constructors.defaul_not_created;

public class Main {
    public static void main(String[] args) {
        // we declared a constructor with parameters inside the Animal class,
        // so no default constructor was created.

        // when creating an object without parameters - the compiler will swear
         Animal animal = new Animal();
    }
}