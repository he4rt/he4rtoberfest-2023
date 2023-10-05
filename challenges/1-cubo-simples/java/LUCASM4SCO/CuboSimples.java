import javax.swing.JOptionPane;

public class CuboSimples {
    public static void main(String[] args) {
        try {
            while(true) {
                iniciarCalculadora();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você enviou um valor não numérico, finalizando programa...");
        } catch (Exception e) {
            System.out.println("Finalizando programa...");
        }
    }

    public static void iniciarCalculadora() throws NumberFormatException {
        String inputUsuario = JOptionPane.showInputDialog("Digite um número para calcular o cubo:");
        double numero = Double.parseDouble(inputUsuario);
        double resultado = Math.pow(numero, 3);
        String numeroFormatado = resultado % 1 == 0 ? String.format("%.0f.", resultado) : String.format("%.2f.", resultado); 
        JOptionPane.showMessageDialog(null, "Resultado: " + numeroFormatado);
    }
}