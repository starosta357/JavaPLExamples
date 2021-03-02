package _9collection.ex_003_arrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Example_1 {
    public static void main(String[] args) throws Exception {
        // Create ArrayList object
        List<String> arrayList = new ArrayList<>();

        // create BufferedReader object
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // using loop to fill collection from keyboard
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter value [" + i + "]");
            String s = reader.readLine();
            // Add value to the end of the array
            arrayList.add(s);
        }

        // Remove the last line and add it to the beginning
        for (int i = 0; i < 5; i++) {
            String s1 = arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, s1);
        }

        // Displaying all content
        for (String temp : arrayList) {
            System.out.println(temp);
        }
    }
}
