package _3introduction_to_Java_OOP.constructors.ex_005_constructors.private_constructor;

public class Animal {
    private int age;

    // the declared constructor is private.
    // Can only be used within this class
    private Animal(int age) {
        this.age = age;
    }
}