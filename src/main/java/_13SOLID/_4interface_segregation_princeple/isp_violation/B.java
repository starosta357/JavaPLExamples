package _13SOLID._4interface_segregation_princeple.isp_violation;

public class B {
    private I2 i2;

    public B(I2 i2) {
        this.i2 = i2;
    }

    public void callGetProducts(){
        i2.getProducts();
    }
}
