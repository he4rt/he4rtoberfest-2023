import javax.swing.JOptionPane;

public class Palindromos {
    public static void main(String[] args){
        try {
            iniciarPrograma();
        } catch (Exception e) {
            System.out.println("Finalizando execução do programa...");
        }
    }

    public static void iniciarPrograma(){
        while (true) {
            String inputUsuario = JOptionPane.showInputDialog("Digite uma palavra para verificar se é palíndromo:");
            boolean isPalindromo = verificarPalindromo(inputUsuario.trim().toLowerCase());

            if (isPalindromo) {
                JOptionPane.showMessageDialog(null, "true");
                continue;
            }

            JOptionPane.showMessageDialog(null, "false");
        }   
    }

    public static boolean verificarPalindromo(String palavra){
        StringBuilder palavraReverso = new StringBuilder(palavra).reverse();
        boolean isPalindromo = palavraReverso.toString().equals(palavra);
        return isPalindromo;
    }
}