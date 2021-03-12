package _12java8.ex_001_lambdaExpression.lambdaExpression;

public class Lamp implements ElectricityConsumer {

    private void lightOn() {
        System.out.println("Lamp message");
    }

    public void electricityOn(Object sender) {
        lightOn();
    }
}
