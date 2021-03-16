package _13SOLID._1single_reponsibility_principle.modem_srp_solution;

public class DataManagerImpl implements IDataManager {

    @Override
    public void send(String str) {
        System.out.println("sent data");
    }

    @Override
    public int receive() {
        System.out.println("received data");
        return 0;
    }
}
