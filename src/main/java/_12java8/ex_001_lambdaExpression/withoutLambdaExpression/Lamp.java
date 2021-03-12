package _12java8.ex_001_lambdaExpression.withoutLambdaExpression;

public class Lamp implements ElectricityConsumer {

    private void lightOn() {
        System.out.println("lightOn");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
