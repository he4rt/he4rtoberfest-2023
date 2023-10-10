import java.util.Arrays;

public class OrderLetters {
    public static void main(String[] args) {
        String[] input = args[0].split("");
        Arrays.sort(input);
        System.out.println(String.join("", input));
    }
}
