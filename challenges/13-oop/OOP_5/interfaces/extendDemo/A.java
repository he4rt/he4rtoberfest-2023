package Java.Youtube.OOP_5.interfaces.extendDemo;

public interface A {

    // static interface method should always have a body
    // call via the interface name
    static void greeting() {
        System.out.println("Hey i am static method");
    }
    default void fun() {
        System.out.println("I am in A");
    }
}
