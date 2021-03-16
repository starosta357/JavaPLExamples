package _13SOLID._5dependency_inversion_principle.solution;

public class SimpleLogin implements Authenticator {

    //low level class

    @Override
    public boolean authenticate(User user) {
        // logic - database

        return true;
    }
}
