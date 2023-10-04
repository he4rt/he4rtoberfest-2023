public class Palindromos {
    public static void main(String[] args) {
        String palavra = args[0].toLowerCase();

        System.out.println(checarPalindromo(palavra));
    }

    public static boolean checarPalindromo(String palavra) {
        int left = 0;
        int right = palavra.length() - 1;

        while (left < right) {
            if (palavra.charAt(left) != palavra.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
