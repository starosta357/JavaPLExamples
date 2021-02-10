package _3introduction_to_Java_OOP.class_and_packages.ex_004_method_calling;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        // call the method of the Car class through the car1 object
        car1.setMaxSpeed(140);
        int speed = car1.getMaxSpeed();
        System.out.println(speed);

        // call the method of the Car class through the car2 object
//        car2.maxSpeed; // we do not have access to private ones from other classes
        car2.setMaxSpeed(150);
        System.out.println(car2.getModel());
    }
}
