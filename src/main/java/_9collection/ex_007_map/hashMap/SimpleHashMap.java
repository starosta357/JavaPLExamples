package _9collection.ex_007_map.hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap {
    public static void main(String[] args) {
        // Map:
        // 1) Store key-value pairs
        // 2) Search is very easy by key value
        // 3) Key value in Maps is unique. (hashCode and equals methods guarantees it)
        // 4) If element with given key is not in Map - null value will be returned.
        // 5) HashTable - duplicate, instead use the ConcurrentHashTable
        // 6) HashMap - extends from AbstractMap and use hashTable for key
        // 7) TreeMap - use natural order for sorting the key or comparator
        // 8) LinkedHashMap - remember the order of adding to the map



        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, 25);
        hm.put(null, 50);

        System.out.println(hm.get(null));

        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("something_1", "a");
        lhm.put("something_2", "d");
        lhm.put("something_3", "b");

        Set<Map.Entry<String, String>> set = lhm.entrySet();

        for (Map.Entry<String, String> stringStringEntry : set) {
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }
    }
}
