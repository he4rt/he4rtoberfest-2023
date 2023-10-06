package Java.Youtube.OOP_2.packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void massege() {
        System.out.println("Hello world");
//        System.out.println(this.age); // can't use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
