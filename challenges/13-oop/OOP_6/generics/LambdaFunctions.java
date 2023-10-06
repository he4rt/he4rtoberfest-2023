package Java.Youtube.OOP_6.generics;



import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

//        list.forEach((item) -> {System.out.println(item * 2);});

//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        Operation diff = (a, b) -> a - b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operation(5,3,sum));
        System.out.println(myCalculator.operation(5,3,mul));
        System.out.println(myCalculator.operation(5,3, diff));

    }

    private int  operation(int a, int b, Operation op) {
        return op.operation(a,b);
    }
//    int sum(int a, int b) {
//        return a + b;
//    }
}

interface Operation{
    int operation(int a, int b);
}
