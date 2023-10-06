package Java.Youtube.OOP_3.properties.polymorphism;

public class Number {
    double sum(int a , int b) {
        return a + b;
    }

    double sum(double a , int b) {
        return a + b;
    }
    int sum(int a , int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.sum(2, 4);
        obj.sum(3, 4, 5);

//        obj.sum(4, 56, 75, 4);
    }
}
