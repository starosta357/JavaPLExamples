package _4principles_inheritance_and_polymorphism.ex012_final_methods;

class ClassA {
    public void method1() {
        System.out.println("ClassA.method1");
    }

    public void method2() {
        System.out.println("ClassA.method2");
    }
}

class ClassB extends ClassA {
    @Override
    public final void method1() {
        System.out.println("ClassB.method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB.method2");
    }

    public void methodFromB() {
        System.out.println("methodFromB");
    }

}

class ClassC extends ClassB {
    // Attempting to override method1 results in a compiler error.
    // @Override
    // public void method1() { System.out.println("ClassC.method1"); }

    // Overriding method2 is allowed.
    @Override
    public final void method2() {
        System.out.println("ClassC.method2");
    }
}

class ClassD extends ClassA {
}

class Main extends Object {

    public static void main(String[] args) {
        ClassC instance = new ClassC();

        if (instance instanceof ClassC){
            instance.methodFromB();
        }else {
            System.out.println("No");
        }


//        instanceA.method1();
//        instanceA.method2();
//
//        System.out.println("-------------------");
//
//        ClassB instanceB = new ClassB();
//        instanceB.method1();
//        instanceB.method2();
//
//        System.out.println("-------------------");
//
//        ClassC instanceC = new ClassC();
//        instanceC.method1();
//        instanceC.method2();
    }
}
