package _10exception_and_IO.IO.ex_003_DataOutputStream_DataInputStream;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))) {
            out.writeShort(1200);
            out.writeInt(1111);
            out.writeLong(10L);
            out.writeUTF("Hello World!!!");

            //Flushes this data output stream.
            out.flush();
            out.writeUTF("Hello World!!!");

            System.out.println("Short " + in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " + in.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
