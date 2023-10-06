package Java.Youtube.OOP_2.singleton;

import Java.Youtube.OOP_4.access.A;

public class Main {
    public static void main(String[] args) {

//        SingleTon obj; //  SingleTon obj = new SingleTon(); can't call it like this (SingleTon is privet constructor)

        SingleTon obj1 = SingleTon.getInstance();

        SingleTon obj2 = SingleTon.getInstance();

        SingleTon obj3 = SingleTon.getInstance();

        // all 3 ref variable are pointing to just one object

        A a = new A(12,"a");
        a.getNum();
//        int n = a.num;

    }
}
