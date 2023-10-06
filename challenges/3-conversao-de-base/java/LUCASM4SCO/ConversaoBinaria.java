import javax.swing.JOptionPane;

public class ConversaoBinaria {
    public static void main(String[] args) {
        try {
            iniciarCalculadoraBinaria();
        } catch (Exception e) {
            System.out.println("Finalizando programa...");
        }
    }

    public static void iniciarCalculadoraBinaria() {
        while (true) {
            String inputUsuario = JOptionPane.showInputDialog("Digite um número decimal que deseja converter:");
            String binario = converterDecimalParaBinario(Integer.parseInt(inputUsuario));
            JOptionPane.showMessageDialog(null, binario);
        }
    }

    public static String converterDecimalParaBinario(int decimal) {
        String numeroBinario = "";

        do {
            int baseQuociente = decimal % 2;
            decimal = decimal / 2;
            numeroBinario += baseQuociente;
        } while (decimal != 0);

        numeroBinario = new StringBuilder(numeroBinario).reverse().toString();
        return numeroBinario; 
    }
}