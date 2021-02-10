package _3introduction_to_Java_OOP.constructors.ex_006_constructors.overload;

public class Animal {
    private int age;
    private int height;

    // overloaded constructors
    public Animal() {
        // set the initial parameters of the fields.
        // Usually in such situations the parameters are set by default.
        this.age = 14;
        this.height = 60;
    }

    public Animal(int age) {
        // we set one initial parameter,
        // the second we specify when creating an object
        this.age = age;
        this.height = 66;
    }

    public Animal(int age, int height) {
        // both parameters are set when creating an object
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