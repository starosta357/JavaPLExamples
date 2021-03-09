package _10exception_and_IO.IO.ex_008_randomAcessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class SimpleRandomAccessFile {
    public static void main(String[] args) {
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile("randomText.txt", "rw");
            raf.write(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            // seek - to set the first position
            raf.seek(5);
            raf.write(new byte[]{33, 44, 55});
            raf.seek(0);
            byte[] arr = new byte[10];
            int n = raf.read(arr, 0, 5);
            System.out.println(Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
