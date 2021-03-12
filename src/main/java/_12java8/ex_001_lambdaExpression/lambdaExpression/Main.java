package _12java8.ex_001_lambdaExpression.lambdaExpression;

public class Main {

    private static void fire(Object sender) {
        System.out.println("Fire!!!");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Fire";

        // effectively final
//         message = "Fire_2";

        switcher.addElectricityListener(sender -> System.out.println(message));

//        switcher.addElectricityListener(sender -> {
    //            out.print("Пожар");
    //            out.println("!!!");
    //        });

//        switcher.addElectricityListener((Object sender) -> System.out.println("Fire"));

// ============================================================

//        switcher.addElectricityListener(s -> Main.fire(s));

        switcher.addElectricityListener(Main::fire);

        switcher.switchOn();
    }
}
