package _6nested_classes_enums_wrapper_classes.enums.ex004_abstract_methods;

public enum Company {
    // Instances.
    EPAM(1000) {
        // You can override methods for individual instances.
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        // Abstract methods must be overridden in instances of enumerated types.
        @Override
        public String getCurrency() {
            return "dollars";
        }
    }, GOOGLE(100) {
        // Abstract methods must be overridden in instances of enumerated types.
        @Override
        public String getCurrency() {
            return "cents";
        }
    }, SKYNET(10) {
        // You can override methods for individual instances.
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        // Abstract methods must be overridden in instances of enumerated types.
        @Override
        public String getCurrency() {
            return "euros";
        }
    }; //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // The constructor can only be private.
    Company(int value) {
        this.value = value;
    }

    // You can override methods for "all" instances of an enumerated type.
    @Override
    public String toString() {
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}