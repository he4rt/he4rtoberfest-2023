package Java.Youtube.OOP_2.singleton;

public class SingleTon {
    int num = 0;
    private SingleTon () {

    }

    private static SingleTon instance;

    public static SingleTon getInstance() {
        // check whether 1 obj only created or not
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
