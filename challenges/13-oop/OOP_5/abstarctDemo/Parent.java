package Java.Youtube.OOP_5.abstarctDemo;

public abstract class Parent {

    int age;
    final int Value;
    public Parent(int age) {
        this.age = age;
        Value = 32342;
    }

    static void hello() {
        System.out.println("hey");
    }
    
    void normal() {
        System.out.println("this is a normal methods");
    }
    abstract void career();
    abstract void partner();
}
