package _5abstract_classes_and_interfaces.static_members_repeat.ex001_static;

public class NotStaticClass {
    private int id;
    public static int field;

    public NotStaticClass(int Id) {
        this.id = Id;
    }

    public void method() {
        System.out.println("Instance{0}.field = " + id + ", " + field);
    }
}
