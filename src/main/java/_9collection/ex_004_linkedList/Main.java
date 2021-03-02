package _9collection.ex_004_linkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Call a method that measures the time of 10 thousand insertions into the list
        System.out.println("ArrayList: " + getTimeMsOfInsert(new ArrayList()));
        System.out.println("LinkedList: " + getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insert10000(list);

        Date newTime = new Date();
        // Calculate the difference between currentTime and newTime
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            // Insert objects at the beginning
            list.add(0, new Object());
        }
    }
}
