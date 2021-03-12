package _12java8.ex_001_lambdaExpression.withoutLambdaExpression;

public class Main {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);


        String message = "Fire";

//        class Fire implements ElectricityConsumer {
//            public void electricityOn(Object sender){
//                System.out.println("FIRE");
//            }
//        }

        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        System.out.println(message);
                    }
                }
        );

        switcher.switchOn();
    }
}
