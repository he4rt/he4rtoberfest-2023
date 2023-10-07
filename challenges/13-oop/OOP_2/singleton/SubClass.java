package Java.Youtube.OOP_2.singleton;

import Java.Youtube.OOP_4.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "obj");
//        int n = obj.num;
    }
}

class Subsubclass extends SubClass2 {

    public Subsubclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        Subsubclass obj = new Subsubclass(45, "obj");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "obj");
//        int n = obj.num;
    }
}

