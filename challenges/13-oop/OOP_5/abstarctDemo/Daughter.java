package Java.Youtube.OOP_5.abstarctDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i love ironman");
    }
}
