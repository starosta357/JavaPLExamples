package _6nested_classes_enums_wrapper_classes.enums.ex003_enumerations;

//Constructor and methods.
enum Company {
    // Instances.
    ITVDN(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // The constructor can only be private.
    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.ITVDN;
        System.out.println("I work for a company " + myComp +
                " and earn " + myComp.getValue() + "$");
    }
}
