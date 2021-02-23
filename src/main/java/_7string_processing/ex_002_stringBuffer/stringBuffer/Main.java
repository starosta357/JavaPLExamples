package _7string_processing.ex_002_stringBuffer.stringBuffer;

public class Main {
    public static void main(String[] args) {
        String str1 = "I am ";
        String str2 = " here";
        int paws = 4;
        StringBuffer sb = new StringBuffer(20);
        sb.append(str1).append(paws).append(str2);
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
