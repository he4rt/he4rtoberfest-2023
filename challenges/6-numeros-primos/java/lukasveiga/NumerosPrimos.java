import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)){

            System.out.println("Informe um número inteiro: ");
            var number = scan.nextInt();
            scan.nextLine();

            System.out.println(isPrime(number));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static boolean isPrime(int number) {
        if(number == 0) {
            throw new ArithmeticException("Zero is neither prime nor composite");
        }
        
        if(number <= 1) {
            return false;
        }

        if(number == 2){
            return true;
        }

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}