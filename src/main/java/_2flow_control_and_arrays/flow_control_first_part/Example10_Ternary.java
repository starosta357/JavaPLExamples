package _2flow_control_and_arrays.flow_control_first_part;

public class Example10_Ternary {

    public static void main(String[] args) {
        double quantity = 9;    // Number of items.
        double price = 100;      // Unit price.
        double discount = 0.75;  // Total cost discount - 25%.
        double cost;             // Total cost.

        // IF: Bought 10 units or more. THEN: you will have a discount 25%. ELSE: any discount.

        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        System.out.println("General cost: " + cost + "$");
    }
}
