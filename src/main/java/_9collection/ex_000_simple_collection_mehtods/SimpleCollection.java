package _9collection.ex_000_simple_collection_mehtods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleCollection {
    public static void main(String[] args) {
        //Array vs ArrayList
        String[] arr = new String[10];
        List<String> arrayList = new ArrayList<>(); //newCap = oldCap * 1.5 + 1

        int i = arr.length;
        arrayList.size();

        arr[0] = "str";
        arrayList.add("str");

        String s = arr[3];
        arrayList.get(3);

        arr[0] = "str_2";
        arrayList.set(0, "str_2");


        Collection<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

//        System.out.println(list1.add(1));
//        System.out.println(list1.size());

        Collection<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.addAll(list1);
        System.out.println(list2 + ": " + list2.size());

        list2.clear();
        System.out.println(list2 + " " + list2.size());
        System.out.println(list2.isEmpty());


        Object[] arr2 = list2.toArray();
        for (int l = 0; l < arr.length; l++)
            System.out.println(arr[l]);
        System.out.println(arr.length);

    }
}
