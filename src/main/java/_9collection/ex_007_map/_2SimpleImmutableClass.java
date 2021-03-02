package _9collection.ex_007_map;

public final class _2SimpleImmutableClass {
    // immutable class better to use as a key value for map
    // Class is immutable if:
    // 1) class declared as final
    // 2) fields declared as final
    // 3) only getters but without setters methods


    private final int id;
    private final String firstName;

    public _2SimpleImmutableClass(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
