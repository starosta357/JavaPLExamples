package _3introduction_to_Java_OOP.constructors.ex_004_constructors.defaul_not_created;

public class Animal {
    private int age;

    // created a constructor with parameters
    // the default constructor will not be created until you do it by hand
    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
    }
}