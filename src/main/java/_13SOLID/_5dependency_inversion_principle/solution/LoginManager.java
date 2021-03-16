package _13SOLID._5dependency_inversion_principle.solution;

//High level class

public class LoginManager {
    Authenticator authenticate;

    public LoginManager(Authenticator authenticate) {
        this.authenticate = authenticate;
    }

    public void login(User user) {
        authenticate.authenticate(user);
    }
}
