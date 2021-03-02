package _9collection.ex_004_linkedList;

import java.util.LinkedList;

public class AllYouNeedToKnow {
    public static void main(String[] args) {
        // General about LinkedList:
        // 1) We have "head" - first element and "tail" - last element
        // 2) Each element of linked list know ONLY about next and previous element in the list
        // 3) Head know about next element and the tail elements
        // 4) Tail know about previous element and the head elements
        // 5) Remove and add the element faster than in ArrayList because you only need to change the links
        // 6) If in LinkedList is empty: next and previous links will be reference to this null element.
        // 7) It is possible to add null value
        // 8) Can be duplication
        // 9) LinkedList implements List, Deque interfaces. (Deque - Last in First out) - LiFo


        //                                      ArrayList               vs              LinkedList:
        // Get elements: get()                  fast                                    slow ( O(n) )
        // Set elements: set()                  fast                                    slow
        // Add elements: add()                  fast(Without increasing the size)       fast
        // Put elements: add(i, value)          slow                                    fast
        // Del elements: remove()               slow                                    fast



        // In java references spend a lot of memory in Java - so if you have a lot of elements
        // ArrayList will perform better


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("obj_1");

        linkedList.addFirst("obj_2");
        linkedList.addLast("obj_3");


        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());


        System.out.println(linkedList.removeFirstOccurrence("first value"));
        System.out.println(linkedList.removeLastOccurrence("third value"));

    }
}
