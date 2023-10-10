import java.util.Scanner;

public class CuboSimples{
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        if(args.length != 3){
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe o 1º valor: ");
            num1 = sc.nextInt();
            System.out.print("Informe o 2º valor: ");
            num2 = sc.nextInt();
            System.out.print("Informe o 3º valor: ");
            num3 = sc.nextInt();
        }else {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);
        }
        System.out.println(num1 * num1 * num1);
        System.out.println(num2 * num2 * num2);
        System.out.println(num3 * num3 * num3);
    }
}