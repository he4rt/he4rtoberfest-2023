import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DivisorDeStrings {
    public static void main(String[] args){
        try {
            iniciarDivisor();
        } catch (Exception e) {
            System.out.println("Finalizando execução do programa...");
        }
    }
    
    public static void iniciarDivisor(){
        while(true) {
            String palavra = JOptionPane.showInputDialog("Digite a palavra para dividir:");
            ArrayList<String> lista = dividirPalavra(palavra);
            imprimirLista(lista);
        }
    }

    public static ArrayList<String> dividirPalavra(String palavra){
        ArrayList<String> listaSeparada = new ArrayList<String>();

        for (int i = 0; i < palavra.length(); i += 2 ) {
            if (i + 1 < palavra.length()) {
                listaSeparada.add(palavra.substring(i, i + 2));
            } else {
                listaSeparada.add(palavra.substring(i) + '$');
            }
        }

        return listaSeparada;
    }

    public static void imprimirLista(ArrayList<String> lista){
        String listaString = "[";

        for (int i = 0; i < lista.size(); i++){
            if (i + 1 == lista.size()) {
                listaString += "'" + lista.get(i) + "'";
            } else {
                listaString += "'" + lista.get(i) + "', ";
            }
        }

        listaString += "]";

        JOptionPane.showMessageDialog(null, listaString);
    }
}