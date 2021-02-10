package _3introduction_to_Java_OOP.constructors.ex_006_constructors.overload;

public class Main {
    public static void main(String[] args) {
        // creating objects with different parameters
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(22);
        Animal animalWithTwoParameters = new Animal(23, 61);

        // output of object parameters
        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: " + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: " + animalWithTwoParameters.getHeight());
    }
}