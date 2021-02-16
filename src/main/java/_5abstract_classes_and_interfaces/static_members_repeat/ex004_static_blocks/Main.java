package _5abstract_classes_and_interfaces.static_members_repeat.ex004_static_blocks;

//Usually we use the static block to set default value.
public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.x);

        NotStaticClass instance = new NotStaticClass(1111);
        System.out.println(instance.x);

        System.out.println(NotStaticClass.x);
    }
}
