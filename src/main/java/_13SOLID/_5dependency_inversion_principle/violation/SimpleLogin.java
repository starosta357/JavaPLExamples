package _13SOLID._5dependency_inversion_principle.violation;

public class SimpleLogin {

    //low level class

    public boolean authenticate(User user) {
        // logic - database

        return true;
    }
}
