
import java.util.Scanner;

public class SimpleCubo {
    public static void main(String[] args) {

        System.out.println("Olá, digite um numero desejado : ");

        System.out.println(calculoCubo());;






    }

    public static int calculoCubo () {
        Scanner leituScanner = new Scanner (System.in);
        int input = leituScanner.nextInt();
        leituScanner.close();

        return (int) Math.pow(input, 3);



    }






}
