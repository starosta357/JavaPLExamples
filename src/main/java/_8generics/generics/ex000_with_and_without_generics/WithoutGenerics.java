package _8generics.generics.ex000_with_and_without_generics;

public class WithoutGenerics {
    public static void main(String[] args) {
        WithoutGeneric withoutGen1 = new WithoutGeneric("Test");
        WithoutGeneric withoutGen2 = new WithoutGeneric(10);
        WithoutGeneric withoutGen3 = new WithoutGeneric(new MyCustomClass2("Value"));

        withoutGen1.printValue();
        withoutGen2.printValue();
        withoutGen3.printValue();

        //you can do like this because you don't use generics
        withoutGen1 = withoutGen2;

        //try to run this program to see that runtime exception will be present.
        String  s = (String) withoutGen1.getObject();
        System.out.println(s);
    }
}

class WithoutGeneric {
    Object object;

    public WithoutGeneric(Object object){
        this.object = object;
    }

    public void printValue() {
        System.out.println(object);
    }

    public Object getObject(){
        return object;
    }
}

class MyCustomClass2 {
    String simpleString;

    public MyCustomClass2(String value){
        this.simpleString = value;
    }

    @Override
    public String toString() {
        return this.simpleString;
    }
}

