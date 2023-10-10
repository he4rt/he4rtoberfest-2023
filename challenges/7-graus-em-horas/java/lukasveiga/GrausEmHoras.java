import java.util.Scanner;

public class GrausEmHoras {

    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)){
            System.out.println("Informe um ângulo: ");
            var degree = scan.nextInt();
            scan.nextLine();

            System.out.println(degreesToHours(degree));
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        
    }

    private static String degreesToHours(int degrees) {
        var time = (double) degrees/30;
        var hours = (int) time;
        var minutes = (int) (60 * (time - hours));

        return String.format("%d:%02d", hours, minutes);
    }
    
}
