package _10exception_and_IO.IO.ex_007_readingFile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f1 = new File("B:\\IdeaProject\\JavaPLExamples\\src\\main\\java\\_10exception_and_IO\\IO\\ex_007_readingFile\\example.txt");

        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
        pw.println("Good Luck");
        pw.flush();
        pw.close();
    }
}
