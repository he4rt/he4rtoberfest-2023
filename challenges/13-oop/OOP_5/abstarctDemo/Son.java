package Java.Youtube.OOP_5.abstarctDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("i love pepper potts");
    }
}
