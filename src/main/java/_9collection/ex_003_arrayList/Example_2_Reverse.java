package _9collection.ex_003_arrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Example_2_Reverse {
    public static void main(String[] args) throws Exception {
        // create ArrayList object
        List<String> arrayList = new ArrayList<>();

        // create BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // using loop to fill collection from keyboard
        for (int i = 0; i < 5; i++) {
            System.out.println("enter value [" + i + "]");
            String s = reader.readLine();
            // Add value to the end of the array
            arrayList.add(s);
        }

        // Loop through the entire length of arrayList
        for (int i = 0; i < arrayList.size(); i++) {
            // We write the value of the last element to a variable j
            int j = arrayList.size() - i - 1;
            System.out.println(arrayList.get(j));
        }
    }
}
