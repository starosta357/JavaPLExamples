package _9collection.ex_006_set.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args){
        // Set:
        // 1) Can not have a duplication
        // 2) You responsible for element uniqueness via correct overriding equals() and hashCode() methods
        // 3) SortedSet interface extends from Set and sorted your set by using Comparator object or in natural order.
        // 4) NavigableSet interface extends SortedSet and used for easier element searching.
        // 5) EnumSet - for storing the enumerations.
        // 6) HashSet - the most popular one, because use hashTable and this allowed to interact with elements fast.
        // 7) TreeSet - implements NavigableSet, use for sorted sets. (can not store null value)
        // 8) LinkedHashSet - the diff from HashSet is that elements saved the order when you add them.
        // 9) U can store null value in sets. (TreeSet - exception)


        Set<String> hashSet = new HashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
        hashSet.add("value_1");
        hashSet.add("value_2");
        hashSet.add("value_3");
        hashSet.add("value_1");
        hashSet.add("value_4");
        hashSet.add("value_5");
        for (String text : hashSet) {
            System.out.println(text + " " + text.hashCode());
        }
    }
}
