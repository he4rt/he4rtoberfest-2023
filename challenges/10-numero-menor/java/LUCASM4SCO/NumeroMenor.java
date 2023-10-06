import java.util.Arrays;
import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            while(true) {
                System.out.print("Digite um número: ");
                String input = scanner.nextLine().trim();
                int numero = Integer.parseInt(input);
                int resultado = calcularNumeroMenor(numero, numero - 1);
                System.out.println(resultado);
            }
        } catch (Exception e) {
            System.out.print("Finalizando o programa...");
        }
    }

    public static int calcularNumeroMenor(int numero1, int numero2) {
        String str1 = String.valueOf(numero1);
        String str2 = String.valueOf(numero2);
        
        char[] sorted1 = str1.toCharArray();
        Arrays.sort(sorted1);
        char[] sorted2 = str2.toCharArray();
        Arrays.sort(sorted2);

        if (sorted1.length > sorted2.length || numero2 < 10)
            return -1;

        if (Arrays.equals(sorted1, sorted2))
            return numero2;

        return calcularNumeroMenor(numero1, numero2 - 1);
    }
}