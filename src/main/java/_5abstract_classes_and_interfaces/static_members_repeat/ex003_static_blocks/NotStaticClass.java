package _5abstract_classes_and_interfaces.static_members_repeat.ex003_static_blocks;

public class NotStaticClass {
    public static final int x;

    // static block.
    static {
        x = 10;
        System.out.println("Static block  X = " + x);
    }

    public NotStaticClass() {
        // X = 4; // Error, because static block called before constructor.
        System.out.println("Constructor  X = " + x);
    }
}
