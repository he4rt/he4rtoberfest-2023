package Java.Youtube.OOP_5.abstarctDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();
        Daughter daughter = new Daughter(25);
        daughter.career();

        Parent.hello();
//        Parent mom = new Parent(23);


    }
}
