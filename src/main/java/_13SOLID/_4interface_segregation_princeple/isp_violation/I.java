package _13SOLID._4interface_segregation_princeple.isp_violation;

import java.util.List;

public class I implements I1, I2 {
    private final Customer customer;
    private final List<Product> products;

    public I(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
