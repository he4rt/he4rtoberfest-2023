package Java.Youtube.OOP_5.interfaces.extendDemo;

public class Main implements A, B{

    @Override
    public void greet() {

    }


//    @Override
//    public void fun() {
//
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}