import java.util.ArrayList;
import java.util.Scanner;

public class ParesDeLetras {
    
    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)){

            System.out.println("Informe uma palavra: ");
            var word = scan.nextLine();

            System.out.println(wordToLettersPairs(word));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static ArrayList<String> wordToLettersPairs(String word) {
        var pairs = new ArrayList<String>();

        if(word.length() % 2 != 0) {
            word += "$";
        }

        for (int i = 0; i < word.length() - 1; i++) {
            var firstLetter = String.valueOf(word.charAt(i));
            var secondLetter = String.valueOf(word.charAt(i+=1));
            pairs.add(String.format("'%s%s'", firstLetter, secondLetter));
        }

        return pairs;
    }
}
