import java.util.*;

public class palindromos {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        String contrario = "";
        
        System.out.println("Verificar se as palavras arara, abacaxi, AmA e rADar são palíndromos.");
        String nome = ent.nextLine();

        
        for (int i = (nome.length() -1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }
        
        
        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}
    
    
