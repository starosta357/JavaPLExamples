package _9collection.ex_003_arrayList;

import java.util.ArrayList;
import java.util.List;

public class AllYouNeedToKnow {
    public static void main(String[] args) {
        // General for Lists in Java:
        // 1) Can have duplicate elements inside (in Set this is not allowed)
        // 2) Can configure where you want to put the element (position)
        // 3) You can get the element by index (in Set this is not possible)


        // Array vs ArrayList :
        // It is general recommendation from Oracle to use ArrayList because of the dynamic expansion.
        // But, array will work faster if you need to get the element.


        // it is bad practice to use a raw type like this:
//        List al = new ArrayList<>();
//        al.add(10);
//        al.add("String");


        // default capacity = 10 (you can find it in the ArrayList class DEFAULT_CAPACITY value there)
        // we use capacity when we need to increase memory for the ArrayList.
        // Formula: newCapacity = oldCapacity * 1.5 + 1
        ArrayList<String> arrayList = new ArrayList<>();

        //by default method "add" add value to the end of the ArrayList
        arrayList.add("Str_1");


        arrayList.set(0, "Str_2");


        //error
//        arrayList.set(20, "Str_2");


        arrayList.add(0, "Str_3");


        for (String value : arrayList) {
            System.out.println(value);
        }


        // size() != capacity
        System.out.println(arrayList.size());


        // trimToSize() - after this method size() == capacity
        // this method need to spend less memory for the storing data
        arrayList.trimToSize();

        for (String value : arrayList) {
            System.out.println(value);
        }


        // in array when u remove element all going elements shift to the one position left
        // remove by position
        arrayList.remove(0);

        // remove by first finding value if exist
        arrayList.remove("Str_3");


        System.out.println(arrayList.get(0));


        System.out.println(arrayList.toArray());


        //return "-1" if element not in the array list
        System.out.println(arrayList.indexOf("Str_2"));


        System.out.println(arrayList.contains("Str_2"));


        arrayList.clear();

        for (String value : arrayList) {
            System.out.println(value);
        }

    }
}
