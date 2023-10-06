package Java.Youtube.OOP_5.interfaces.nasted;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1 ) == 1;
    }
}
