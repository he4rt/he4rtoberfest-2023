package Java.Youtube.OOP_2.packages.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human nikunj = new Human(21, "Nikunj Makwana", 10000, false);
//        Human rahul = new Human(23, "Rahul gandhi", 15000, true);
//        Human arpit = new Human(23, "Arpit gandhi", 15000, true);
//
//        System.out.println(nikunj.name);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

       Main funn = new Main();
       funn.fun2();

    }

    // this is not dependent on object
    static void fun() {

//        greeting(); // you can't use that because it requires an instance
                    // but the function you are using it in does not depend on instance

        // you can't access non static stuff without referencing their instances
        // a static context
        Main obj = new Main();
        obj.greeting();

    }

    void fun2() {
        greeting();
    }

    // we  know that something which is not static, belong to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}
