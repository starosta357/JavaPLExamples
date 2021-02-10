package _3introduction_to_Java_OOP.class_and_packages.ex_002_access_modifiers;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.square = 24.0; // public field access
        System.out.println(shape.square);

        //set parameters to our object
        shape.setHeight(200);
        shape.getHeight();

        shape.setLength(144);
        shape.getLength();

        //display the object through the method
        shape.viewShape();
    }
}
