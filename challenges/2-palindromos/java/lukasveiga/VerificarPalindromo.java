import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in);) {

            System.out.println("Informe uma palavra: ");
            var palavra = scan.nextLine();

            System.out.println(isPalindrome(palavra));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static boolean isPalindrome(String word) {
        var formatedWord = word.toLowerCase();

        var invertedWord = new StringBuilder();

        for(int i = formatedWord.length() -1 ; i >= 0; i--) {
            invertedWord.append(formatedWord.charAt(i));
        }

        return formatedWord.equals(invertedWord.toString());
    }
}