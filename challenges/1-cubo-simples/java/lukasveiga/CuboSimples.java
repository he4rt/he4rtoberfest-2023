import java.util.Scanner;

public class CuboSimples {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in);){
            
            System.out.println("Informe um número: ");
            var input = scan.nextInt();
            scan.nextLine();

            var result = calcularCubo(input);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    static private int calcularCubo(int numero){
        return (int)Math.pow(numero, 3);
    }
}
