package _8generics.generics.ex000_with_and_without_generics;

import java.util.Objects;

public class GenericApproach {
    public static void main(String[] args) {
        // <String> - this generic we can call as closed.
        WithGen<Object> withGen1 = new WithGen<>("Test");
        WithGen<Integer> withGen2 = new WithGen<>(10);
        WithGen<MyCustomClass> withGen3 = new WithGen<>(new MyCustomClass("Value"));

        withGen1.printValue();
        withGen2.printValue();
        withGen3.printValue();

        //you can not do like this because you use generics
//        withGen1 = withGen2;
    }
}

// we call <T> - as a open type declaration of generic, because u can
// pass any type.
class WithGen<T> {
    T object;

    public WithGen(T object){
        this.object = object;
    }

    public void printValue() {
        System.out.println(object);
    }

}

class MyCustomClass {
    String simpleString;

    public MyCustomClass(String value){
        this.simpleString = value;
    }

    @Override
    public String toString() {
        return this.simpleString;
    }
}
