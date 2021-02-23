package _7string_processing.ex_002_stringBuffer.bufferMethods;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("length ->" + sb.length());
        System.out.println("capacity ->" + sb.capacity());
//        sb = "Java"; // error, only for String class u can use literal
        sb.append("Java");
        System.out.println("string ->" + sb);
        System.out.println("length ->" + sb.length());
        System.out.println("capacity ->" + sb.capacity());
        System.out.println("reverse ->" + sb.reverse());
    }
}

