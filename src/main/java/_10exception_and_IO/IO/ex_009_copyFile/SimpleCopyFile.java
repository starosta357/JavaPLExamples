package _10exception_and_IO.IO.ex_009_copyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;


public class SimpleCopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("B:\\IdeaProject\\JavaPLExamples\\src\\main\\java\\_10exception_and_IO\\IO\\ex_009_copyFile\\sourceFile.txt");
        File targetFile = new File("B:\\IdeaProject\\JavaPLExamples\\src\\main\\java\\_10exception_and_IO\\IO\\ex_009_copyFile\\targetFile.txt");

        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
