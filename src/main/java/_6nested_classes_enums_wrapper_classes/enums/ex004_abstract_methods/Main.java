package _6nested_classes_enums_wrapper_classes.enums.ex004_abstract_methods;

public class Main {
    public static void main(String[] args) {
        // An object with a reference to an instance of the Company enumerated type.
        Company myComp = Company.EPAM;
        System.out.println(myComp.toString());

        // Calling method
        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("I earn " + salary + " " + currency);
    }
}
