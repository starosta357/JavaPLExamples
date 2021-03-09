package _10exception_and_IO.IO.ex_004_FileInputStream;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)){
            File file = new File("B:/IdeaProject/JavaPLExamples/src/main/java/_10exception_and_IO/IO/ex_004_FileInputStream/Main.java");
            pw.println();
            pw.println("File \"" + file.getName() + "\" " + (file.exists() ? "exists" : "does not exist"));
            pw.println("You can " + (file.canRead() ? "" : "not") + " read file");
            pw.println("You can " + (file.canWrite() ? "" : "not ") + "write to file");
            pw.println("File size " + file.length() + " b");
            pw.println();
            File dir = new File("B:/IdeaProject/JavaPLExamples/src/main/java/_10exception_and_IO/IO");
            pw.println("Contains directory:");
            if (dir.exists() && dir.isDirectory()) {
                String[] s = dir.list();
                for (String value : s) {
                    pw.println(value);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

