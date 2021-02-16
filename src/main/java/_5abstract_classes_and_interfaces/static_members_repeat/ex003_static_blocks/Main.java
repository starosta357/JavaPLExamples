package _5abstract_classes_and_interfaces.static_members_repeat.ex003_static_blocks;


public class Main {
    static int i = 3;
    public static void main(String[] args) {
        System.out.println(NotStaticClass.x);

        NotStaticClass instance = new NotStaticClass();
        System.out.println(instance.x);
    }
}
