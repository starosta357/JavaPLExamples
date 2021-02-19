package _6nested_classes_enums_wrapper_classes.enums.ex002_enumerations;


// The constants of enumerated types are static final by default.
enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
//         You cannot override an instance of an enumerated type.
//         Day.MONDAY = Day.FRIDAY;

        Day today = Day.SATURDAY;
        switch (today) {
            case SATURDAY:
                System.out.println("First day of the weekend - Saturday.");
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend - Sunday.");
                break;
            default:
                System.out.println("The weekday - " + today);
        }

        // Also, you can compare instances of enumerated types using the == operator
        if (today == Day.SATURDAY) {
            System.out.println("Finally, weekend!");
        }
    }
}
