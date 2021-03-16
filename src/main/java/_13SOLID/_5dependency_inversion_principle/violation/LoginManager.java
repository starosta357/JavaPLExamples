package _13SOLID._5dependency_inversion_principle.violation;

//High level class

public class LoginManager {
    //this class has a strong relationship with SimpleLogin class
    SimpleLogin authenticate = new SimpleLogin();

    public void login(User user) {
        authenticate.authenticate(user);
    }
}
