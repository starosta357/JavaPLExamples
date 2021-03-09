package _10exception_and_IO.IO.ex_010_moveFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) {
        File sourceFile = new File("B:\\IdeaProject\\JavaPLExamples\\src\\main\\java\\_10exception_and_IO\\IO\\ex_010_moveFile\\sourceFile.txt");
        File targetFile = new File("B:\\IdeaProject\\JavaPLExamples\\src\\main\\java\\_10exception_and_IO\\IO\\sourceFile.txt");

        try {
            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
