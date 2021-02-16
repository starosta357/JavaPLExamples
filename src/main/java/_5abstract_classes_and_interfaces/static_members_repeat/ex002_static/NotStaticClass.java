package _5abstract_classes_and_interfaces.static_members_repeat.ex002_static;

public class NotStaticClass {
    private int id;

    // constructor.
    public NotStaticClass(int id) {
        this.id = id;
    }

    public static void method() {
        //System.out.println("Instance.id = {0}", id);

        System.out.println("Can't invoke non-static field");
    }
}
