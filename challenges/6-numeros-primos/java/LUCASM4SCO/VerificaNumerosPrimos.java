import javax.swing.JOptionPane;

public class VerificaNumerosPrimos {
    public static void main(String[] args) {
        try {
            iniciarVerificador();
        } catch (Exception e) {
            System.out.println("Finalizando execução...");
        }
    }

    public static boolean verificarNumeroPrimo(int numero, int divisor) {
        if (divisor < 2) {
            return true;
        }
        
        if (numero % divisor == 0) {
            return false;
        }
        
        return verificarNumeroPrimo(numero, divisor - 1);
    }

    public static void iniciarVerificador(){
        while(true) {
            String inputUsuario = JOptionPane.showInputDialog("Digite um número para verificar se é primo:");
            int numeroDigitado = Integer.parseInt(inputUsuario);

            if (numeroDigitado <= 1) {
                JOptionPane.showMessageDialog(null, "false");
                continue;
            }

            boolean isPrimo = verificarNumeroPrimo(numeroDigitado, numeroDigitado / 2);

            if (isPrimo) {
                JOptionPane.showMessageDialog(null, "true");
                continue;
            }

            JOptionPane.showMessageDialog(null, "false");
        }   
    }
}