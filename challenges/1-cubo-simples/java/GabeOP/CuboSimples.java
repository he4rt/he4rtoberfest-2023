import java.util.*;

public class CuboSimples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número que deseja calcular: ");
      System.out.print("- ");

    System.out.println("Resultado: " + elevaAoCubo(sc.nextInt()));

  }
  private static int elevaAoCubo(int numero) {
    return (int)Math.pow(numero, 3);
  }
}