package _6nested_classes_enums_wrapper_classes.enums.ex001_enumerations;

enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        // An object with a reference to an instance of the Day enumerated type.
        Day today = Day.SATURDAY;
        System.out.println("Today is " + today);

        int number = 4;
        // You cannot assign an integer value.
        // today = number;
        // today = 4;
    }
}

