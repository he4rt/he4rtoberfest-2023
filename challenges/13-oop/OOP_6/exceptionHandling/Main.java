package Java.Youtube.OOP_6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a, b);
            // mimicking
//            throw new Exception("Jus for fun");

            String name = "Nikunj";
            if (name.equals("Nikunj")) {
                throw new MyException("Name is Nikunj");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
         throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
