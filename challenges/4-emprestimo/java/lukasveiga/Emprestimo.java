import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {

        try (var scan = new Scanner(System.in);){

            System.out.println("Informe os valores do empréstimo, taxa de juros e o tempo em anos: ");
            var input = scan.nextLine();

            var values = formatInput(input);

            System.out.println(calculateFees(values.get(0), values.get(1), values.get(2)));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static String calculateFees(double loan, double feesRate, double years) {
        double finalValue = Math.pow((1 + (feesRate/100)), years) * loan;
        return String.format("%.2f", finalValue);
    }

    private static ArrayList<Double> formatInput(String input) {
        var values = input.split(",");
        var formatedValues = new ArrayList<Double>();

        for(String value : values) {
            formatedValues.add(Double.parseDouble(value.trim()));
        }

        return formatedValues;
    }
}
