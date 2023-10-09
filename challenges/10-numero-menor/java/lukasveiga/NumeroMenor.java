import java.util.Scanner;

public class NumeroMenor {

    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)){

            System.out.println("Informe um número: ");
            var number = scan.nextInt();
            scan.nextLine();

            System.out.println(closerMinorNumber(number));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }

    private static int closerMinorNumber(int number) {

        var stringNumber = String.valueOf(number);

        for(int i = number - 1; i >= 0;i--) {

            var flag = false;

            var used = "";

            var stringIndex = String.valueOf(i);

            if(stringNumber.length() != stringIndex.length()) {
                break;
            }

            for(String s : stringIndex.split("")) {

                if(!stringNumber.contains(s) || used.contains(s)) {
                    flag = false;
                    break;
                }

                used += s;

                flag = true;
            }

            if(flag) {
                return i;
            }
        }
        return -1;
    }
}