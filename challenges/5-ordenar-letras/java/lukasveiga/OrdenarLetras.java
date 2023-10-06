import java.util.Arrays;
import java.util.Scanner;

public class OrdenarLetras {

    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)){

            System.out.println("Informe uma palavra: ");
            var word = scan.nextLine();

            System.out.println(orderLetters(word));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static String orderLetters(String word) {
        var letters = word.split("");
        Arrays.sort(letters);
        return String.join("", letters);
    }
}
