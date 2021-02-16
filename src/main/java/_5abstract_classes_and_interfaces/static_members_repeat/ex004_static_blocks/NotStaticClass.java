package _5abstract_classes_and_interfaces.static_members_repeat.ex004_static_blocks;


//It is possible to create many static blocks and they will called one by one in writing order
public class NotStaticClass {
    static int x;

    static {
        x = 1;
        System.out.println("Static block  x = " + x);
    }

    static {
        x = 23;
        System.out.println("Static block  x = " + x);
    }

    static {
        x = -99;
        System.out.println("Static block  x = " + x);
    }

    public NotStaticClass(int x) {
        this.x = x;
        System.out.println("Constructor  X = " + x);
    }
}
