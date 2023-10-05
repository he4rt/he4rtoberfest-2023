import java.util.Scanner;

public class ConversaoDecimalBinario {
    public static void main(String[] args) {

        try(var scan = new Scanner(System.in)) {

            System.out.println("Informe um número decimal: ");
            var decimal = scan.nextInt();
            scan.nextLine();

            System.out.println(convertDecimalToBinary(decimal));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static String convertDecimalToBinary(int decimal) {
        var binary = new StringBuilder();

        while(decimal >= 1) {
            binary.append((decimal % 2) > 0 ? "1": "0");
            decimal /= 2;
        }

        return binary.reverse().toString();
    }
}