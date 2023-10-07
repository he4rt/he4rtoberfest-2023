package Java.Youtube.OOP_1;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//
//        Integer num = 45; // Integer num = new Integer(45);

        Integer a = 10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;  // you can't modify

        final A nikunj = new A("Nikunj Makwana");
        nikunj.name = "other name";

        // when a a non primitive is final , you cannot reassign it.
//        nikunj = new A("other object");
        A obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new A("random name");
        }
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A (String name) {
        this.name = name;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
