package _3introduction_to_Java_OOP.constructors.ex_007_constructors.from_constructors;

public class Animal {
    private int age;
    private int height;

    // analogue of overloading constructors by calling
    // a constructor from a constructor
    public Animal() {
        this(13, 69);
    }


    // overloading a constructor (method) with the same parameters NOT POSSIBLE,
    // even if they are different variables by name
//    public Animal(int age) {
//        this(age, 71);
//    }

    public Animal(int height) {
        this(12, height);
    }

    public Animal(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}