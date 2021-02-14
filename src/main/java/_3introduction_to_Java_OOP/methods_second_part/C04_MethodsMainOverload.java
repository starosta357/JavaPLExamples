package _3introduction_to_Java_OOP.methods_second_part;

public class C04_MethodsMainOverload {
    public static void main(String[] args) {
        if(args.length > 0)  // if arguments were entered through the console
            System.out.println(args[0]);  //then print the first element from the array to the console

        else {  //else —
            C04_MethodsMainOverload obj = new C04_MethodsMainOverload(); //create and object
            main(); // and use usual main method with name main()
        }
    }

    public static void main() {  // general method with name main()
        System.out.println("it's usual main method without String[] args!");
    }
}
