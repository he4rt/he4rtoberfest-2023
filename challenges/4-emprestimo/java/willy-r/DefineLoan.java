import java.util.Locale;

public class DefineLoan {
    public static void main(String[] args) {
        String[] input = args[0].replaceAll(" ", "").split(",");
        double loanValue = Double.parseDouble(input[0]),
            interestRate = Double.parseDouble(input[1]),
            years = Double.parseDouble(input[2]);
        double output = loanValue * Math.pow(1 + interestRate / 100, years);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", output);
    }
}
