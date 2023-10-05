public class NumerosPrimos {
    public static void main(String[] args) {
        Integer input = Integer.parseInt(args[0]);

        System.out.println(isPrime(input));
    }

    public static boolean isPrime(Integer number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++){
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }
}
