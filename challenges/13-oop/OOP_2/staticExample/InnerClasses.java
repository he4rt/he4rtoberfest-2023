package Java.Youtube.OOP_2.staticExample;

public class InnerClasses {

    static class Test {
        String name;

        public Test (String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Nikunj");
        Test b = new Test("Karan");

        System.out.println(a);
//        System.out.println(b.name);
    }
}
