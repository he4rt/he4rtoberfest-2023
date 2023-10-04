import java.util.Scanner;

public class CuboSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numeroBase = input.nextDouble();
        double numeroExpoente = 3;

        System.out.println(Math.pow(numeroBase, numeroExpoente));
    }
}
