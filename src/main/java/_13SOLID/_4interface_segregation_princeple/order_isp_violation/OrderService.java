package _13SOLID._4interface_segregation_princeple.order_isp_violation;

public interface OrderService {

    //backend methods

    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);

    //frontend methods

    boolean processOrder(int orderId);

}
