public class Palindromes {
    public static void main(String[] args) {
        String input = args[0];
        String reversedInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);    
        }
        System.out.println(input.equalsIgnoreCase(reversedInput));
    }
}
