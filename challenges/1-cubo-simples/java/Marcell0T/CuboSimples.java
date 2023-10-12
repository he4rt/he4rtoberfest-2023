public class CuboSimples {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println((int) Math.pow(Integer.parseInt(arg), 3));
        }
    }
}