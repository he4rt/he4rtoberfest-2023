import java.util.Arrays;
import javax.swing.JOptionPane;

public class OrdenadorDeLetras {
    public static void main(String[] args) {
        while(true) {
            String inputUsuario = JOptionPane.showInputDialog("Digite uma palavra pra ordernar suas letras:");
            
            if(inputUsuario == null) {
                break;
            }

            char[] caracteres = inputUsuario.toCharArray();
            Arrays.sort(caracteres);
            JOptionPane.showMessageDialog(null, new String(caracteres));
        }
    }
}