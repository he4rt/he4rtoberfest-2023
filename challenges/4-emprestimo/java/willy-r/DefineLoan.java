import java.math.BigDecimal;
import java.util.Locale;

public class DefineLoan {
    public static void main(String[] args) {
        String[] input = args[0].replaceAll(" ", "").split(",");
        var loanValue = new BigDecimal(input[0]);
        double interestRate = (double) Integer.parseInt(input[1]),
            years = (double) Integer.parseInt(input[2]);
        var output = loanValue.multiply(new BigDecimal(Math.pow(1 + interestRate / 100, years)));
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", output);
    }
}
