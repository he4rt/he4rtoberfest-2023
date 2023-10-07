public class PrimeNumbers {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.println(isPrime(input));
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true; // Special cases.
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) { // Starts at 5 because 4 isn't prime.
            // Check for prime by testing divisors up to the square root of the number.
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
