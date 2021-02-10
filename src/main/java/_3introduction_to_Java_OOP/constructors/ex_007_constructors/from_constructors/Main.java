package _3introduction_to_Java_OOP.constructors.ex_007_constructors.from_constructors;

public class Main {
    public static void main(String[] args) {
        // example of creating objects with different parameters
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(12);
        Animal animalWithTwoParameters = new Animal(14, 50);

        // output of object parameters
        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: " + animalWithTwoParameters.getHeight());
    }
}