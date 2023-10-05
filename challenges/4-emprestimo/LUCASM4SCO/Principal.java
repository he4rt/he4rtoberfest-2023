import javax.swing.JOptionPane;
import java.util.Locale;

public class Principal {
    public static void main(String[] args){
        try {
            iniciarPrograma();
        } catch (Exception e) {
            System.out.println("Finalizando o programa...");
        }
    }

    public static void iniciarPrograma(){
        while(true) {
            String inputUsuario = JOptionPane.showInputDialog("Digite o valor do empréstimo, a taxa de juros e o tempo em anos separados por uma vírgula:");
            String[] valoresEmprestimo = inputUsuario.split(",");

            double valorEmprestimo = Double.parseDouble(valoresEmprestimo[0].trim());
            int taxaJuros = Integer.parseInt(valoresEmprestimo[1].trim());
            int periodoAnual = Integer.parseInt(valoresEmprestimo[2].trim());

            Emprestimo emprestimo = new Emprestimo(valorEmprestimo, periodoAnual, taxaJuros);
            JOptionPane.showMessageDialog(null, String.format(Locale.US, "%.2f",  emprestimo.calcularEmprestimo()));
        }
    }
}
