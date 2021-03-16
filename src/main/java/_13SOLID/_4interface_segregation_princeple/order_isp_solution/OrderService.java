package _13SOLID._4interface_segregation_princeple.order_isp_solution;

public interface OrderService {

    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);

}